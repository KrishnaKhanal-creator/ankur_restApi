package com.ankur.inventory.domain;

import java.util.Collection;
import java.util.List;

public class InventoryFindByNameResponse {

    private Collection<Item> items;

    public InventoryFindByNameResponse(Collection<Item> items) {
        this.items = items;
    }

    public InventoryFindByNameResponse(){

    }

    public Collection<Item> getItems() {
        return items;
    }
}
