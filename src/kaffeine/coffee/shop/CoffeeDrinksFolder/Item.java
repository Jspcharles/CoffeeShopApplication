/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaffeine.coffee.shop;

import java.text.NumberFormat;

/**
 *
 * @author jeewan
 */
public class Item {
    
    private int itemId;
    private String itemName;
    private int quantity;
    private float price;
    private int preference;

    public Item(int itemId, String itemName, int quantity, float price, int preference) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.preference = preference;
    }

    public int getPreference() {
        return preference;
    }

    public void setPreference(int preference) {
        this.preference = preference;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        
        NumberFormat nf=NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(2);
        
        return itemName + " - "+nf.format(price) + " "+ "["+ quantity+"]";
    }
    
    
    
}
