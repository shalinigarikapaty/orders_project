package com.mypackage.consumerservice.domain;
import com.mypackage.domain.Consumer;
import com.mypackage.common.Money;
import com.mypackage.common.PersonName;
import com.mypackage.domain.ConsumerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
@Transactional
public class ConsumerService {

    @Autowired
    private ConsumerRepository consumerRepository;

    public void validateOrderForConsumer(long consumerId, Money orderTotal) {
        Optional<Consumer> consumer = consumerRepository.findById(consumerId);
        consumer.orElseThrow(ConsumerNotFoundException::new).validateOrderByConsumer(orderTotal);
    }

    public Consumer create(PersonName name) {
        Consumer consumer = consumerRepository.save(new Consumer(name));
        return consumer;
    }

    public Optional<Consumer> findById(long consumerId) {
        return consumerRepository.findById(consumerId);
    }
}

