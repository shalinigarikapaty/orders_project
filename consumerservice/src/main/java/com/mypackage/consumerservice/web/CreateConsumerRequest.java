package com.mypackage.consumerservice.web;

import com.mypackage.common.PersonName;

public class CreateConsumerRequest {
    private PersonName name;

    public PersonName getName() {
        return name;
    }

    public void setName(PersonName name) {
        this.name = name;
    }

    public CreateConsumerRequest(PersonName name) {

        this.name = name;
    }

    private CreateConsumerRequest() {
    }


}
