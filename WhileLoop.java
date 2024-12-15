/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whileloop;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
    int grade = 0 , sum = 0 , counter = 1;    
        Scanner input = new Scanner(System.in);
  while ( counter <= 6 )      
  {   
    System.out.println(" Enter grade for student number " + counter);
    grade = input.nextInt();
    sum += grade;
    counter++ ;   
  } 
  System.out.println(" Average of the 6 grades is " + sum/6 );
    
    
    
    
    
    
    }
}
