package org.string;

import javax.sound.midi.Soundbank;

public class GreenBank {
	public static void main(String[] arg) {
		int e[] = new int[5];
		e[0] =10;
		e[1] =20;
		e[2] =30;
	    e[3] =40;
		e[4] =50;
		
		System.out.println(e[3]);
		
		int length = e.length;
		System.out.println(length);
		
		for(int i=0; i <e.length; i++) {
			System.out.println(e[i]);
		}
		 System.out.println("===========");
		  
		 for (int y:e) {
			 System.out.println(y);
			 
		 }
		
		 System.out.println("===========");
		  
		 int g[][] = new int[2][4];
		 
		 g[0][0]=10;
		 g[0][1]=20;
		 g[1][0]=30;
		 g[1][1]=40;
	    g[0][2]=78;
	     
	     for (int i=0; i<g.length; i++) {
			    	 
			     for (int j=0; j<g.length; j++) {
			    	 System.out.println(g[i][j]);
			    		 
			     }
			     System.out.println("===========");
			     
			    	 for (int[] y:g) {
			    		 for (int i1: y) {
			    			 System.out.println(i1);
			    		 }
			    	 }
	     }
	     }
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

}
