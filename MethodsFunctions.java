/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methods.functions;

/*
public class MethodsFunctions {
    
    //Write a java method to find the smallest number among three numbers
     static int smallestNumber ( int n1 , int n2 , int n3 ){
         if ( n1 < n2 && n1 < n3 ){
             return n1 ;  
        }else if ( n2 < n1 && n2 < n3 ){
             return n2 ;
        }else { return n3 ;}
     }
    

    public static void main(String[] args) {
        int smallNum = smallestNumber( 10 , 5 , 9 );
        System.out.println( smallNum );
    }
}
*/



import java.util.Scanner;
public class MethodsFunctions {
    //Write a java method to compute the average of three numbers
    static float avg ( float n1 , float n2 , float n3 ){
        float sum = n1 + n2 + n3 ;
        float avge = sum / 3 ;
        return avge ; 
    }
    
    
    public static void main ( String [] args ){
        Scanner scanner = new Scanner ( System.in );
            System.out.println(" Enter the 1st num ");
                float x = scanner.nextFloat();
            System.out.println(" Enter 2nd num ");
                float y = scanner.nextFloat();
            System.out.println(" Enter the 3rd num ");
                float z = scanner.nextFloat();
        float average = avg( x , y , z );
          System.out.println(" The average is " + average);
    
    }
    

}









