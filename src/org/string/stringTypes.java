package org.string;

public class stringTypes {

	public static void main(String[] args) {
		String s="JAVA";
		String s1="JAVA";
		
		int hashCode =System.identityHashCode(s);
        System.out.println(hashCode);
        
        int hashCode2=System.identityHashCode(s1);
        System.out.println(hashCode2);
       
        System.out.println("===============");
        
        String s2=new String("Selenium");
        String s3=new String("Selenium");
        
        int hashCode3= System.identityHashCode(s2);
        System.out.println(hashCode3);
        
        int hashCode4= System.identityHashCode(s3);
       System.out.println(hashCode4);
     
       System.out.println("===============");
       
       String s4="Framework";
       String s5="Framework";
       
       int hashCode5=System.identityHashCode(s4);
       System.out.println(hashCode5);
       int hashCode6= System.identityHashCode(s5);
       System.out.println(hashCode6);
       
       String conCat=s4.concat(s5);
       System.out.println(conCat);
       int hashCode7=System.identityHashCode(conCat);
       System.out.println(hashCode7);
       System.out.println("==============");
       
       StringBuffer s6=new StringBuffer("cucumber");
       StringBuffer s7=new StringBuffer("cucumber");
       
       int hashCode8=System.identityHashCode(s6);
       System.out.println(hashCode8);
       int hashCode9=System.identityHashCode(s7);
       System.out.println(hashCode9);
       
       StringBuffer	 append=s6.append(s4);
	   System.out.println(append);
	   
	   int hashCode10=System.identityHashCode(append);
	   System.out.println(hashCode10);
	
       
       
       
       
       
       
       
        
	}

}
