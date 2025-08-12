/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HWs;

import java.util.Scanner;

/**
 *
 * @author A_Murad
 */
public class OddAndEvenNumbers {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            System.out.print("Enter a number: ");
            int number = scan.nextInt();

            if (number % 2 == 0) {
                System.out.println("The number you entered is an even number!");
            } else {
                System.out.println("The number you entered is an odd number!");
            }

        } catch (Exception e) {

            System.err.println("Please Enter An Interger Number...\n" + e);

        }
    }
}
