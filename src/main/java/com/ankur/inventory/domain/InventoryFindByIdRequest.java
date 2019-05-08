package com.ankur.inventory.domain;

public class InventoryFindByIdRequest {

    /**
     * Need this for serialization and de-serialization
     */
    public InventoryFindByIdRequest(){
    }

    private Integer itemId;

    public InventoryFindByIdRequest(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemId() {
        return itemId;
    }


}
