package com.ankur.inventory.domain;

public class InventoryAddItemRequest {

    private Item item;

    public InventoryAddItemRequest(){
    }

    public InventoryAddItemRequest(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }
}
