/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaristasChallenge;

/**
 *
 * @author A_Murad
 */
public class Item {

    //Implement the Order and Item classes as described above.
    private String name;
    private double price;

    //constructor
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //set & get
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}