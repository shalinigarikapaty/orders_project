package com.mypackage.orderservice.web;

import com.mypackage.orderservice.domain.OrderService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

    private OrderService orderService;

    public TicketController(OrderService orderService) {
        this.orderService = orderService;
    }


}

