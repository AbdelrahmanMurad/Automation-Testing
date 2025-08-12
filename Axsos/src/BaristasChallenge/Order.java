/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaristasChallenge;

import java.util.ArrayList;

/**
 *
 * @author A_Murad
 */
public class Order {

    //Implement the Order and Item classes as described above.
    private String name = null;
    private boolean ready = false;
    private ArrayList<Item> items = null;

    //constructors
    public Order() {
        this.name = "Guest";
        items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        items = new ArrayList<Item>();
    }

    //set & get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    //Methods
    public void addItem(Item item) {
        this.items.add(item);
//        int counter = 0;
//        System.out.println("Item Name: " + this.items.get(counter).getName());
//        System.out.println("Item Price: " + this.items.get(counter).getPrice());
//        counter++;
    }

    public String getStatusMessage() {
        if (this.ready == false) {
            return "Thank you for waiting. Your order will be ready soon.";
        } else {
            return "Your order is ready.";
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item : items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

}
