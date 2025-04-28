package com.mishra.mohak.adapterDesignPattern;

public class GroceryItemAdapter implements Item{
    private GroceryItem item;
    public GroceryItemAdapter(GroceryItem gitem) {
        this.item = gitem;
    }

    @Override
    public String getName() {
        return item.getName();
    }

    @Override
    public String getPrice() {
        return item.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return item.getStoreName();
    }
}
