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
public class NegativeIndexesAndExceptionHandling {

	/**
	 * @param args the command line arguments
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			// Step 1: Input two integers
			System.out.println("Input two integers: ");
			int number1 = scan.nextInt();
			int number2 = scan.nextInt();

			// Step 2: Divide the first integer by the second integer
			int division = number1 / number2;
			System.out.println(division);

		} catch (Exception e) {

			// Step 3: Capture the specified exception
			System.err.println(e);

		}
	}

}
