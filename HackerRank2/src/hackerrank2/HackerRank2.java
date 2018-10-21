/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank2;

/**
 *
 * @author charuni
 */ import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class HackerRank2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       


	
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        double b=scan.nextDouble();
        scan.nextLine();
        String c=scan.nextLine();

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
          
        /* Print the sum of both integer variables on a new line. */
        System.out.println(a+i);


        /* Print the sum of the double variables on a new line. */
        System.out.println(b+d);
		
        /* Concatenate and print the String variables on a new line;
     
        	the 's' variable above should be printed first. */
            System.out.println(s+c);


    }
    
}
