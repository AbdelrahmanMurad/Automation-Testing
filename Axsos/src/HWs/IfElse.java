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
public class IfElse {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) {
// Write a JAVA program which takes an integer as input, and checks if this value i divided by 4.
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number: ");
        boolean checkValue = scan.hasNextInt();
        if (checkValue) {
            int input = scan.nextInt();

            if (input % 4 == 0 && input >= 0) {
                System.out.println("The number is divided by 4.");
            } else if (input < 0) {
                System.err.println("Please! Enter Positive Value.");
            } else {
                System.out.println("The number is not divided by 4.");
            }

        } else {
            System.err.println("Please! Enter INTEGER Number...");
        }

    }

}
