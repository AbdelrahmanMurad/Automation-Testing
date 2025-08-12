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
public class FindFactorial {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to find the factorial: ");

        try {
            int number = scan.nextInt();

            if (number < 0) {
                System.err.println("Please enter a positive integer number...");
                return;
            }

            int factorial = 1;
            /*
            fac = fac * index
            fac = 1*1 = 1
            fac = 1*2 = 2
            fac = 2*3 = 6
            fac = 6*4 = 24
            fac = 24*5 = 120
             */
            for (int index = 1; index <= number; index++) {
                factorial *= index;
            }

            System.out.println("The factorial of " + number + " is: " + factorial);

        } catch (Exception e) {
            System.err.println("Please enter an integer number...\n" + e);
        }
    }
}
