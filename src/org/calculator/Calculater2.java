package org.calculator;

import java.util.Scanner;

public class Calculater2 {

	public static void main(String[] args) {
		Calculator c= new Calculator();
		Scanner s = new Scanner(System.in );
        int a, b;
        char operator;
        System.out.print("Enter A : ");
        a=s.nextInt();
        System.out.print("Enter B : ");
        b=s.nextInt();
        
        if(a==b) {
  		  System.out.println("the value is equal");
        }
        if(a<b) {
		  System.out.println("a value is lessthan b");	  
        }
        else {
  		  System.out.println("a value is greaterthan b ");
	}
       
  	}

}
