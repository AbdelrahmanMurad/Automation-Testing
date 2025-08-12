/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdersAndItems;

/**
 *
 * @author A_Murad
 */
public class TestOrders {
	
    public static void main(String[] args) {
        //Create the testing file TestOrders and complete the rest of the tasks inside the testing file.
        // Menu items
        // Order variables -- order1, order2 etc.
        // Application Simulations
        // Use this example code to test various orders' updates
        Order order = new Order();

        order.name = "Mohammed";
        order.total = 123.4;
        order.ready = true;

//        order1.name = 21; // Error
//        order1.total = ""; // Error
//        order1.ready = ""; // Error
        System.out.printf("Name: %s\n", order.name);
        System.out.printf("Total: %s\n", order.total);
        System.out.printf("Ready: %s\n", order.ready);
        System.out.println("*********************************");

        // Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2, etc.
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        //Set the price and the name for each - "mocha", "latte", "drip coffee" and "cappuccino." The price is up to you.
        item1.name = "mocha";
        item1.price = 11;

        item2.name = "latte";
        item2.price = 12;

        item3.name = "drip coffee";
        item3.price = 13;

        item4.name = "cappuccino";
        item4.price = 14;

        //Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2, etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        //Set each order's name - "Cindhuri", "Jimmy", "Noah", and "Sam."
        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        //Print the order1 variable to the console to see what happens.
        System.out.println("Order1 Name: " + order1.name);

        //Predict what will happen if you print 'order1.total'. => 0.0
        System.out.println("Order1 total: " + order1.total);

        //Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1); // total incremented by item price from item1.
        order2.total += item1.price; // we can avoid using it at the first time, but if its the second time we must use it.
        System.out.println("Order2 Item Name: " + order2.items.get(0).name);
        System.out.println("Order2 Item Price: " + order2.items.get(0).price);

        //Noah ordered a cappuccino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;
        System.out.println("Order3 Item Name: " + order3.items.get(0).name);
        System.out.println("Order3 Item Price: " + order3.items.get(0).price);

        //Sam added a latte. Update the order accordingly.
        order4.items.add(item2);
        System.out.println("Order4 Item Name: " + order4.items.get(0).name);
        System.out.println("Order4 Item Price: " + order4.items.get(0).price);

        //Cindhuri’s order is now ready. Update her status.
        order1.ready = true;
        System.out.println("Order1 Status: " + order1.ready);

        //Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2; // *2 => instead of repetition
        System.out.println("Order4 Item Name (2nd): " + order4.items.get(1).name);
        System.out.println("Order4 Item Name (2nd): " + order4.items.get(1).price);
        System.out.println("Order4 Item Name (3rd): " + order4.items.get(2).name);
        System.out.println("Order4 Item Name (3rd): " + order4.items.get(2).price);

        //Jimmy’s order is now ready. Update his status.
        order2.ready = true;
        System.out.println("Order2 Status: " + order2.ready);
    }
}
