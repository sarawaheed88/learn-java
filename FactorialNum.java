/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialnum;
import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println(" Please Enter The Number");
    int num = input.nextInt();
    int factNum = 1 ;
       for ( int i = 1 ; i <= num ; i++  )
       {
         factNum *= i ;
       }
       System.out.println(" The Factorial Num is" +factNum);  
    }
}
