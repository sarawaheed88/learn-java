/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.variables;
import java.util.Scanner;
public class Variables {
     
      //this program to calculate rectangle area
//      int length, width, area ;
////      int width;
////      int area;
//      System.out.println("Enter rectangle length");
//      length = input.nextInt();
//      System.out.println("Enter rectangle width ");
//      width = input.nextInt();
//      area = length * width ;
//      System.out.println(area);
//      System.out.printf("The Rectangle area is %d",area);
     public static void main(String [] args){
      Scanner input = new Scanner (System.in);
      String fname;
      float salary;
      float net_salary;
      System.out.println("Enter your first name");
      fname = input.next();
      System.out.println("Enter your salary");
      salary = input.nextFloat();
      net_salary = salary - (salary * 0.10f);
//      System.out.println(net_salary);
System.out.printf("your net salary is %f",net_salary);
      
      
      }

}