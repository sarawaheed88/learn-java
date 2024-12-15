/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.forloop;
/*Write a program that asks the user to input a number n
 then prints all prime numbers from 1 to n
 Use a nested loop to check for divisibility.
*/
import java.util.Scanner;
public class ForLoop {
    public static void main ( String [] args ){
        Scanner scanner = new Scanner ( System.in );
            System.out.println("Enter a number : ");
                int n = scanner.nextInt();
                    System.out.println(" Prime numbers from 1 to " + n + " : ");
                        for ( int i = 2 ; i <= n ; i++  ){
                            boolean isPrime = true ; 
                            for ( int j = 2 ; j <= Math.sqrt(i) ; j++ ){
                                if ( i % j == 0){
                                    isPrime = false ;
                                    break ;
                                }
                            }
                            if ( isPrime ){
                                System.out.println( i + " ");
                            }
                        }
    }
}
