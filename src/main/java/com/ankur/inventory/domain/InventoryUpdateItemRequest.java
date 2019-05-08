package com.ankur.inventory.domain;

public class InventoryUpdateItemRequest {

    private Item item;

    public InventoryUpdateItemRequest(Item item) {
        this.item = item;
    }

    public InventoryUpdateItemRequest(){
    }

    public Item getItem() {
        return item;
    }
}
