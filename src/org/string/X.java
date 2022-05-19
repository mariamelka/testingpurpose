package org.string;

public class X {

	public static void main(String[] args) {
		String s= "JAVA";
		String s1="java";
		String s2="welcome to java";
		String s3="";
		String s4="welcome to java";
		
		int length=s.length();
		System.out.println(length);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase =s.toLowerCase();
		System.out.println(lowerCase);
		
		int indexOf =s.indexOf("a");
		System.out.println(indexOf);
		
		int lastIndexOf=s.lastIndexOf("a");
		System.out.println(lastIndexOf);
		
		char charAt =s.charAt(2);
		System.out.println(charAt);
		
		boolean ignoreCase= s.equalsIgnoreCase(s);
		System.out.println(ignoreCase);
		
		boolean ignorCase=s.equalsIgnoreCase(s1);
		System.out.println(ignorCase);		
		
		boolean contains=s2.contains("come");
		String replace=s2.replace("java","selenium");
		System.out.println(replace);
		
		boolean startswith = s2.startsWith("wel");
		System.out.println(startswith);
		
		boolean endswith= s2.endsWith("va");
		System.out.println(endswith);
		
		boolean empty= s3.isEmpty();
		System.out.println(empty);
		
		System.out.println(s4);
		
		String trim=s4.trim();
		System.out.println(trim);
		
		String subString= s4.substring(3);
		System.out.println(subString);
		
		String subString2=s2.substring(3,7);
		System.out.println(subString2);
			
				
				
	}

}
