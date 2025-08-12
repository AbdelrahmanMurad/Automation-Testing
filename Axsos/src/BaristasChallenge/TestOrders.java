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
//Create a testing file to complete the test cases for each method.
public class TestOrders {

    public static void main(String[] args) {
        //Create 2 orders for unspecified guests. Do not specify a name.
        Order order1 = new Order();
        Order order2 = new Order();
        System.out.println("Order Name: " + order1.getName());
        System.out.println("Order Name: " + order2.getName());
        System.out.println();

        //Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Ahmad");
        Order order4 = new Order("Zaid");
        Order order5 = new Order("Mahmood");
        System.out.println("Order Name: " + order3.getName());
        System.out.println("Order Name: " + order4.getName());
        System.out.println("Order Name: " + order5.getName());
        System.out.println();

        //Implement the addItem, getStatusMessage, getOrderTotal, and display methods within the Order class.
        Item item1 = new Item("latte", 14.0);
        order3.addItem(item1);
        System.out.println("Item Name: " + order3.getItems().get(0).getName());
        System.out.println("Item Price: " + order3.getItems().get(0).getPrice());
        order3.setReady(true);
        System.out.println(order3.getStatusMessage());
        System.out.println("Price: " + order3.getOrderTotal());
        System.out.println();

        //Add at least 2 items to each of the orders using the addItem method.
        Item item2 = new Item("Milk", 5.0);
        Item item3 = new Item("Tea", 7.0);
        order1.addItem(item2);
        order1.addItem(item3);
//        System.out.println("Item Name: " + order1.getItems().get(0).getName());
//        System.out.println("Item Price: " + order1.getItems().get(0).getPrice());
//        System.out.println("Item Name: " + order1.getItems().get(1).getName());
//        System.out.println("Item Price: " + order1.getItems().get(1).getPrice());
        order2.addItem(item2);
        order2.addItem(item3);
//        System.out.println("Item Name: " + order2.getItems().get(0).getName());
//        System.out.println("Item Price: " + order2.getItems().get(0).getPrice());
//        System.out.println("Item Name: " + order2.getItems().get(1).getName());
//        System.out.println("Item Price: " + order2.getItems().get(1).getPrice());
        order3.addItem(item2);
        order3.addItem(item3);
//        System.out.println("Item Name: " + order3.getItems().get(0).getName());
//        System.out.println("Item Price: " + order3.getItems().get(0).getPrice());
//        System.out.println("Item Name: " + order3.getItems().get(1).getName());
//        System.out.println("Item Price: " + order3.getItems().get(1).getPrice());
        order4.addItem(item2);
        order4.addItem(item3);
//        System.out.println("Item Name: " + order4.getItems().get(0).getName());
//        System.out.println("Item Price: " + order4.getItems().get(0).getPrice());
//        System.out.println("Item Name: " + order4.getItems().get(1).getName());
//        System.out.println("Item Price: " + order4.getItems().get(1).getPrice());
        order5.addItem(item2);
        order5.addItem(item3);
//        System.out.println("Item Name: " + order5.getItems().get(0).getName());
//        System.out.println("Item Price: " + order5.getItems().get(0).getPrice());
//        System.out.println("Item Name: " + order5.getItems().get(1).getName());
//        System.out.println("Item Price: " + order5.getItems().get(1).getPrice());
//        System.out.println();

        //Test your getStatusMessage method by setting some orders to ready and printing the messages for each order.
        order1.setReady(true);
        System.out.println(order1.getStatusMessage());
        order5.setReady(false);
        System.out.println(order5.getStatusMessage());
        order4.setReady(false);
        System.out.println(order4.getStatusMessage());
        System.out.println();

        //Test the total by printing the return value like so: 'System.out.println(order1.getOrderTotal())'.
        System.out.println("Price: " + order1.getOrderTotal());
        System.out.println("Price: " + order2.getOrderTotal());
        System.out.println("Price: " + order3.getOrderTotal());
        System.out.println("Price: " + order4.getOrderTotal());
        System.out.println("Price: " + order5.getOrderTotal());
        System.out.println();

        //Finally, call the display method on all of your orders.
        order1.display();
        System.out.println();
        order2.display();
        System.out.println();
        order3.display();
        System.out.println();
        order4.display();
        System.out.println();
        order5.display();
    }
}
