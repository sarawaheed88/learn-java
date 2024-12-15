/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randomexamples;
import java.util.Scanner;

public class RandomExamples {

    public static void main(String[] args) {
        /*
       Scanner scanner = new Scanner( System.in );
       System.out.println(" Enter the size of thr array : ");
       int size = scanner.nextInt();
       int []arr = new int[ size ];
       System.out.println(" Enter " + size + " numbers ");
       for ( int i = 0 ; i < size ; i++ ){
           System.out.println(" Enter number #" + ( i+1 ));
           arr[i] = scanner.nextInt();
       }
       int max = arr[0] , min = arr[0];
       for ( int num : arr ){
           if ( num > max ){
               max = num ;
           }
           if ( num < min ){
               min = num ; 
           } 
       }
       System.out.println(" Maxmum number is " + max );
       System.out.println(" Minmum number is " + min );
*/
        
        
        Scanner scanner = new Scanner ( System.in );
        System.out.println(" Enter the size of the array : ");
        int size = scanner.nextInt();
        int [] arr = new int [ size ];
        System.out.println(" Enter " + size + " numbers ");
        for( int i = 0 ; i < arr.length ; i++ ){
            System.out.println(" Enter number # " + ( i + 1 ));
            arr[i] = scanner.nextInt();
        }
        boolean isPalindrome = true ;
        for ( int i = 0 ; i < size / 2 ; i++ ){
            if ( arr[i] != arr[ size - i - 1 ]){
                isPalindrome = false ; 
                break ;
            }
        }
        if ( isPalindrome ){
            System.out.println(" The array is a palindrome ");
        }else { 
            System.out.println(" The array is not a palindrome ");
        }
    }
}
