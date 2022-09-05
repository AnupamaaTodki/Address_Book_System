package com.addressbooksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddPerson {
	
	    public static void add() {
	    	
	    ArrayList<Person> list = new ArrayList<Person>();	
    	Person person = new Person();
    		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first name");
		String fname = scanner.next();
		person.setFname(fname);
		
		System.out.println("Enter the last name");
		String lname = scanner.next();
		person.setLname(lname);
		
		System.out.println("Enter the city");
		String city = scanner.next();
		person.setCity(city);
		
		System.out.println("Enter the state");
		String state = scanner.next();
		person.setState(state);
		
		System.out.println("Enter the zip");
		long zip = scanner.nextLong();
		person.setZip(zip);
		
		System.out.println("Enter the phone number");
		long phonenum = scanner.nextLong();
		person.setPhonenum(phonenum);
		
		System.out.println("Enter the email");
		String email = scanner.next();
		person.setEmail(email);
		
		list.add(person);
		System.out.println(person);
		scanner.close();
	}
	    
	    
public static void main(String args[]) {
	
	add();
	
}
}
