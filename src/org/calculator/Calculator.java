package org.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Calculator c= new Calculator();
		Scanner s = new Scanner(System.in );
        int a, b;
        char operator;
        System.out.print("Enter A : ");
        a=s.nextInt();
        System.out.print("Enter B : ");
        b=s.nextInt();
        System.out.print("Enter operator (+, -, *, /)");
        operator = s.next().charAt(0);
        s.close();
         if(operator=='+') {
		  int m=c.add(a,b);
		  System.out.println(m);	  
         }
         if(operator=='-') {
   		  int x=c.subtraction(a,b);
   		  System.out.println(x);

		}
         if(operator=='*') {
         int z=c.multiplication(a,b);
			System.out.println(z);
         }	
         if(operator=='/') {
        	 int y=c.division(a,b);
 			System.out.println(y);
         }
	}		
			
	public int  add(int a, int b) {
		int m=a+b;
		return m;
	}
	public int subtraction (int a,int b) {
		int x=a-b;
		return x;
	}
	public int multiplication(int a,int b) {
		int z=a*b;
		return z;	
	}
	public int division(int a,int b) {
		int y=a/b;
		return y;
	}
		
	}


