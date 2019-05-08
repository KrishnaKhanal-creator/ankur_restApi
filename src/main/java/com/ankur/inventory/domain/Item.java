package com.ankur.inventory.domain;

public class Item {

    private Integer id;
    private String name;
    private Float price;

    public Item(Integer id, String name, Float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }
}
