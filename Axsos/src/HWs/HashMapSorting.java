/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HWs;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author A_Murad
 */
public class HashMapSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        String[] names = {"Ahmad", "Mohammed", "Layan", "Dina"};

        int id = 0;
        for (String name : names) {
            id++;
            map.put(name, id);
        }
        System.out.println(map);
    }

}
