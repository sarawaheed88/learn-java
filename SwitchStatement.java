/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchstatement;
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args) {
//        char grade; 
//        Scanner reader = new Scanner(System.in);
//         System.out.println("Enter your Grade");
//         grade = reader.next().charAt(0);
//         switch (grade)
//         {
//             case 'A' :
//                  System.out.println("Excellent");
//                  break;
//             case 'B' :
//                  System.out.println("Very Good");
//                  break;
//             case 'C' :
//                  System.out.println("Good");
//                  break;
//             case 'D' :
//                  System.out.println("Fair");
//                  break;
//             case 'F' :
//                  System.out.println("Failed");
//                  break;
//             default :
//                  System.out.println("Invalid Grade");
//                 
//         }
int choise , num1 , num2;
Scanner input = new Scanner(System.in);
System.out.println("Enter your choise");
  System.out.println("1. Add two numbers");
  System.out.println("2. Get the double of a positive number");
  System.out.println("3. Get the square of a number");
  choise = input.nextInt();
  
  switch (choise)
  {
      case 1 :
          System.out.println("1. Enter two numbers");
           num1 = input.nextInt();
           num2 = input.nextInt();
          System.out.println(num1 + num2);
          break;
      
      case 2 :
          System.out.println("Enter two numbers");
           num1 = input.nextInt();
           num2 = input.nextInt();
          System.out.println(num1 - num2);
          break;
          
      case 3 :
          System.out.println("Enter positive number");
           num1 = input.nextInt();
           if (num1 > 0)
               System.out.println(num1*num1);
           break;
      default :
          System.out.println("Invalid Input choise");
  
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
