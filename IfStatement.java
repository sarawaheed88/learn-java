/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifstatement;
//Write a java program to calculate grade of student ,
/*
if->percentage >= 90 print A grade ,
if->percentage >= 80 print B grade ,
if->percentage >= 70 print C grade ,
if->percentage >= 60 print D grade ,
otherwise print "fail" .
*/
/*
//import java.util.Scanner;
public class IfStatement{
    public static void main ( String [] args ){
        Scanner input = new Scanner ( System.in );
        System.out.println(" Please Enter your Mark : ");
        int grade = input.nextInt();
            if ( grade >= 90 && grade <= 100 ){
                System.out.println(" Your Grade is A ");
            }
            else if ( grade >= 80 && grade < 90 ){
                System.out.println(" Your Grade is B ");
            }
            else if ( grade >= 70 && grade < 80 ){
                System.out.println(" Your Grade is C ");
            }
            else if ( grade >= 60 && grade < 70  ){
                System.out.println(" Your Grade is D ");
            }
            else{ System.out.println(" Fail ");  } 
     
    }
}
*/





//Write a program Ask the user to enter two numbers and print the larger .
/*
import java.util.Scanner;
public class IfStatement {
    public static void main ( String [] args ){
        Scanner input = new Scanner ( System.in ); 
        int num1 , num2 ;
        System.out.println( " Please enter the first number :" );
        num1 = input.nextInt();
        System.out.println( " Enter the second number : " );
        num2 = input.nextInt();
        if ( num1 > num2 ){
            System.out.println(" The Larger number is " + num1 );
        }else if ( num2 > num1 ){
            System.out.println(" The Larger number is " + num2 );
        }else {
            System.out.println(" Both numbers are equal. ");
        }
    }
}
*/





//Write a program Ask the user to enter number and check is the number positive||negative
/*
import java.util.Scanner;
public class IfStatement{
    public static void main ( String[] args ){
    Scanner input = new Scanner ( System.in );
    int n ;
    System.out.println(" Enter the Number : ");
    n = input.nextInt();
    if ( n >= 0 ){
        System.out.println(" Positive number ");
    }else{
        System.out.println(" Negative number ");
    }
    }
}
*/




//Write a program that asks the user to input three lengths and checks whether they can form a triangle

import java.util.Scanner;
public class IfStatement{
    public static void main ( String [] args ){
    Scanner input = new Scanner ( System.in );
    int len1 , len2 , len3 ;
        System.out.println(" Enter Length number 1 : ");
        len1 = input.nextInt();
        System.out.println(" Enter Length number 2 : ");
        len2 = input.nextInt();
        System.out.println(" Enter Length number 3 : ");
        len3 = input.nextInt();
        
            if( len1 + len2 > len3 && len1 + len3 > len2 && len2 + len3 > len1){
                System.out.println(" The Lengths can form a triangle ");
            }
            else{
                System.out.println(" The Lengths cannot form a triangle ");
            }
    }
}





//Write a program to check if the year is a leap year 
/*
import java.util.Scanner;
public class IfStatement {
    public static void main ( String [] args ){
    Scanner scanner = new Scanner ( System.in );
    int year ; 
        System.out.println(" Enter the Year : ");
        year = scanner.nextInt();
            if (( year % 4 == 0 && year % 100 != 0)||( year % 400 == 0 )){
                System.out.println(" This year is a leap year ");
            }
            else{
                System.out.println(" This year is not a leap year ");
            }
    }
}
*/



//Write a program Ask the user to input character and check if this character Uppercase or lowercase:
/*
import java.util.Scanner;
public class IfStatement {
    public static void main ( String [] args ){
    Scanner scanner = new Scanner ( System.in );
        char character ;
        System.out.println(" Please enter a letter : ");
        character = scanner.next().charAt(0);
            if ( character >= 'A' && character <=  'Z' ){
                System.out.println(" The Character is Uppercase ");
            }
            else if ( character >= 'a' && character <= 'z' ){
                System.out.println(" The Character is Lowercase ");
            }
            else { System.out.println(" Character is not a letter "); }
    }
}
*/



/*Write a program that asks the user to enter a password and 
compares it with a pre-stored password (e.g., password123).
If it is correct, display a success message; if it is incorrect, display an error message.
*/
/*
import java.util.Scanner;
public class IfStatement {
    public static void main ( String [] args ){
        Scanner scanner = new Scanner ( System.in );
        String storedPassword = "sara123";
        System.out.println(" Please Enter your Password :");
        String userPassword = scanner.nextLine();
            if ( userPassword.equals(storedPassword)){
                System.out.println(" Access granted! Password is correct.");
            }
            else{
                System.out.println(" Access denied! Incorrect password. ");
            }    
    }
}
*/





/*Program a game where the program selects a random number between 1 and 100.
The user must guess the number. The program displays a message if the guess is higher or lower than the correct number.
(Hint: Use the Random library to generate random numbers.)*/
/*
import java.util.Random;
import java.util.Scanner;
public class IfStatement {
    public static void main ( String [] args ){
        Random random = new Random();
        int numToGuess = random.nextInt(100) + 1 ;
        int userGuess = 0 ;
        Scanner scanner = new Scanner ( System.in );
        System.out.println(" Guess the number : ");
        
        while ( userGuess != numToGuess ){
            userGuess = scanner.nextInt();
        
        if ( userGuess > numToGuess ){
            System.out.println(" The number is too high ! try again ");
        }
        else if ( userGuess < numToGuess ){
            System.out.println(" The number is too low ! try again ");
        }
        else {
            System.out.println(" Your Guess is Correct ");
        }
        
        }
    }
}
*/
















