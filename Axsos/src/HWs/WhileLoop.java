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
public class WhileLoop {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        //In this assignment, you will write a Java program that will reverse the order of numerical input, using the while loop. 
        //For example, if the input is 123, Then the output of your code should be 321.

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        boolean checkValue = scan.hasNextInt();

        if (checkValue) {
            int input = scan.nextInt(); // 123
            if (input < 0) {
                System.err.println("Please! Enter Positive Value.");
            } else {
                int reversed = 0;
                while (input != 0) {
                    int digit = input % 10; // get last digit of input
                    reversed = (reversed * 10) + digit; // store the digit in reversed
                    input = input / 10; // remove last digit
                }
                System.out.println("Reversed number: " + reversed);
            }
        } else {
            System.err.println("Please! Enter INTEGER Number...");
        }
    }
}