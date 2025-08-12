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
public class UsingforEachinaTwoDimensionalArray {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int row = 0, column = 0;

            System.out.println("Enter row for the array (max 10): ");
            row = scan.nextInt();

            System.out.println("Enter column for the array (max 10): ");
            column = scan.nextInt();

            int[][] array = new int[row][column];

            int numOfElements = row * column;
            System.out.println("Enter " + numOfElements + " Array Elements: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    array[i][j] = scan.nextInt();
                }
            }
            //System.out.println("Length of array: " + array.length);

            System.out.println("The Array is: ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    //%3d => organize the shape of array
                    System.out.printf("%3d ", array[i][j]);
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.err.println("Please Enter Positive Integer Numbers \n" + e);
        }
    }
}
