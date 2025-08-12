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
public class ApplyingTheEqualsMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

            System.out.print("Enter Number 1: ");
//            These cant call equal() method:
//            double number1 = scan.nextDouble();
//            int number1 = scan.nextInt();
            Double number1 = scan.nextDouble();

            System.out.print("Enter Number 2: ");
//            These cant call equal() method:
//            int number2 = scan.nextInt();
//            double number2 = scan.nextDouble();
            Double number2 = scan.nextDouble();

            boolean status = number1.equals(number2);
            System.out.println(status);

        } catch (Exception e) {
            System.err.println("Please Enter Just Numbers \n" + e);
        }
    }

}
