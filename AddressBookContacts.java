package com.addressbooksystem;

import java.util.Scanner;

public class AddressBookContacts {
	
	public static void contacts() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first name");
		String fname = scanner.next();
		System.out.println("Enter the last name");
		String lname = scanner.next();
		System.out.println("Enter the city");
		String city = scanner.next();
		System.out.println("Enter the state");
		String state = scanner.next();
		System.out.println("Enter the zip");
		long zip = scanner.nextLong();
		System.out.println("Enter the phone number");
		long phonenum = scanner.nextLong();
		System.out.println("Enter the email");
		String email = scanner.next();
		scanner.close();
		
		System.out.println(fname + " " + lname +" " + city + " " + state + " " + zip + " " + phonenum + " " + email);
		
	}
	
	public static void main(String args[]) {
		contacts();
		}

}
