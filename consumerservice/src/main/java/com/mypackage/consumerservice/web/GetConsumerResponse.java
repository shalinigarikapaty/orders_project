package com.mypackage.consumerservice.web;

import com.mypackage.common.PersonName;

public class GetConsumerResponse extends CreateConsumerResponse {
    private PersonName name;

    public PersonName getName() {
        return name;
    }

    public GetConsumerResponse(PersonName name) {

        this.name = name;
    }
}
