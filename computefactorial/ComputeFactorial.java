/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computefactorial;

import java.util.Scanner;

/**
 *
 * @author Isaiah J.
 */
public class ComputeFactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non - negaive integer: ");
        long numbuh = input.nextInt();

        if (numbuh > -1) {
            System.out.println("Factorial of " + numbuh + " is " + factorial(numbuh));
        } else {
            System.out.println("I said a NON-NEGATIVE integer. Ya Donut!");
        }
    }

    private static long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }

    }

}
