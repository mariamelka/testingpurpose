package org.string;

public class Person {
	
	int age;
	String name;
	static String city;
	
	void display() {
		System.out.println(age);
	}
	
	void show() {
		System.out.println(name);
	}

	static void displayCity() {
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person();
		
		person1.age=10;
		person1.name="Roho";
		
		person2.age=90;
		person2.name="Melka";
		
		person1.display();
		person2.display();
		
		city="chennai";
//		displayCity();
		
		person1.city = "madurai";
//		displayCity();
		
		person2.city="Trichy";
		displayCity();
//		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		float average=0;
//		float y=0;
//		int length = arr.length;
//		for (int x : arr){
//			 y = y + x;
//			 int j=10;
//		}
//		average = y/length;
//		System.out.println(average);

		}
	

	}


