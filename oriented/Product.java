/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.object.oriented;

/**
 *
 * @author sara
 */
public class Product {
    private String name ;
    private String discription ;
    private float price ;
    private int quantity ;
    private float discount ;
    private String color ;
    
    public Product(){
        this.name = " No name ";
        this.discription = " No discription";
        this.price = 0.0f ;
        this.quantity = 0 ;
        this.discount = 0.0f ;
        this.color = " No color ";
    }
    public Product( String n , String d , float p , int q , float dis){
        this.name = n;
        this.discription = d;
        this.price = p ;
        this.quantity = q ;
        this.discount = dis ;
    }
    public Product( String n , String d , float p , int q , float dis , String c){
        this ( n , d , p , q , dis );
        this.color = c ;
    }
    public void display (){
        System.out.println(" Name = " + name);
        System.out.println(" Discription = " + discription );
        System.out.println(" Price = " + price);
        System.out.println(" quantity = " + quantity );
        System.out.println(" Discount = " + discount );
        System.out.println(" color = " + color );
    }
   
    
    
    



}