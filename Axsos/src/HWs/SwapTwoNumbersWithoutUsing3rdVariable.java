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
public class SwapTwoNumbersWithoutUsing3rdVariable {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {

            System.out.print("Enter Interger Number for A: ");
            int a = scan.nextInt();
            System.out.print("Enter Interger Number for B: ");
            int b = scan.nextInt();

            System.out.println("Input");
            System.out.println("A = " + a + "\nB = " + b);

            //Swap
            a = a + b; // 10 + 20 = 30
            b = a - b; // 30 - 20 = 10
            a = a - b; // 30 - 10 = 20

            System.out.println("Output");
            System.out.println("A = " + a + "\nB = " + b);

        } catch (Exception e) {

            System.err.println("Please Enter Integer Number. \n" + e);

        }
    }
}
