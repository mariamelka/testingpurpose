package org.calculator;

import java.util.ArrayList;
import java.util.List;

public class Call1 {
	public static void main(String[] arg) {
		
		int[] a = {1, 2, 3, 4, 5, 6,7,8,9,10};
	
		    int y = 0;
		
	      //Advanced for loop
	      for( int x : a) {
	          y = y+x;
	      }
	      System.out.println(y);
	
	}
}
