/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdersAndItems;

import java.util.ArrayList;

/**
 *
 * @author A_Murad
 */
public class Order {

    //Create the Order class with the member variables listed above.
    String name;
    double total;
    boolean ready;
    ArrayList<Item> items = new ArrayList<>();
}
