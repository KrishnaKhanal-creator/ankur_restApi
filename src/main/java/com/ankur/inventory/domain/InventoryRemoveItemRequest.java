package com.ankur.inventory.domain;

public class InventoryRemoveItemRequest {

    private Integer itemId;


    public InventoryRemoveItemRequest(){
    }

    public InventoryRemoveItemRequest(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }
}
