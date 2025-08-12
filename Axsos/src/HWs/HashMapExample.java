/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HWs;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author A_Murad
 */
public class HashMapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a HashMap.
        HashMap<String, Integer> map = new HashMap<>();

        //Put elements into the map you created.
        map.put("Grapes", 8);
        map.put("Apple", 7);
        map.put("Banana", 6);
        map.put("Pineapple", 5);

        //Try to duplicate a key.
        map.put("Pineapple", 6);

        //Display the keys.
        System.out.println("Iterating Hashmap...");
        Set<String> keys = map.keySet();

        int counter = 0;
        for (String key : keys) {
            System.out.println(counter + 1 + " " + key);
            counter++;
        }
        System.out.println("-------------------------------");
        for (String key : keys) {
            System.out.println(key + " => " + map.get(key));
        }

        // We see that Pineapple not duplicated.
    }

}
