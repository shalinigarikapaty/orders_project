package com.mypackage.orderservice.web;

import com.mypackage.common.Money;
import com.mypackage.domain.Action;

import java.util.List;

public class GetOrderResponse {
    private long orderId;
    private String state;
    private Money orderTotal;
    private Long assignedCourier;
    private List<Action> courierActions;

    private GetOrderResponse() {
    }

    public Long getAssignedCourier() {
        return assignedCourier;
    }

    public void setAssignedCourier(Long assignedCourier) {
        this.assignedCourier = assignedCourier;
    }

    public GetOrderResponse(long orderId, String state, Money orderTotal,Long assignedCourier, List<Action> courierActions) {
        this.orderId = orderId;
        this.state = state;
        this.orderTotal = orderTotal;

        this.assignedCourier = assignedCourier;
        this.courierActions = courierActions;
    }

    public Money getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(Money orderTotal) {
        this.orderTotal = orderTotal;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public List<Action> getCourierActions() {
        return courierActions;
    }

    public void setCourierActions(List<Action> courierActions) {
        this.courierActions = courierActions;
    }
}

