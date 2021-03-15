package com.day3;

import java.util.Scanner;

class Venue{
	String name;
	String city;
	public void details() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter venue name");
		name=s.nextLine();
		System.out.println("Enter city name");
		city=s.nextLine();
	}
	public void display() {
		System.out.println("Venue Details:");
		System.out.println("Venue Name: "+name);
		System.out.println("City Name: "+city);
	}
}
public class Main {

	public static void main(String[] args) {
		Venue v=new Venue();
		v.details();
		v.display();
	}

}
