package com.mypackage.orderservice.web;

public class ItemIdAndQuantity {
    private String ItemId;
    private int quantity;


    public ItemIdAndQuantity(String itemId, int quantity) {
        ItemId = itemId;
        this.quantity = quantity;
    }

    public String getItemId() {
        return ItemId;
    }

    public void setItemId(String itemId) {
        ItemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
