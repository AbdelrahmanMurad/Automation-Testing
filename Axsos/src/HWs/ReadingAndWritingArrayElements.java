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
public class ReadingAndWritingArrayElements {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("resource")
	public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int rows = 0, columns = 0;

            System.out.println("Enter row for the array (max 10): ");
            rows = scan.nextInt();
            if (rows < 0 || rows > 10) {
                throw new Exception("The number of rows should be bigger than 0 and smaller than or equal 10");
            }

            System.out.println("Enter column for the array (max 10): ");
            columns = scan.nextInt();
            if (columns < 0 || columns > 10) {
                throw new Exception("The number of columns should be bigger than 0 and columns than or equal 10");
            }
            
            int[][] array = new int[rows][columns];

            int numOfElements = rows * columns;
            System.out.println("Enter " + numOfElements + " Array Elements: ");
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    array[row][column] = scan.nextInt();
                }
            }
            //System.out.println("Length of array: " + array.length);

            System.out.println("The Array is: ");
            for (int row = 0; row < rows; row++) {
                for (int column = 0; column < columns; column++) {
                    //%3d => organize the shape of array
                    System.out.printf("%3d ", array[row][column]);
                }
                System.out.println();
            }

        } catch (Exception e) {

            System.err.println(e);

        }
    }
}
