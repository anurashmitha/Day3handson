package com.day3;

import java.util.Scanner;

class Player1{
	String name;
	String country;
	String skill;
	public void details() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the player name");
		name=s.nextLine();
		System.out.println("Enter the country name");
		country=s.nextLine();
        System.out.println("Enter the skill name");
        skill=s.nextLine();
	}
	public void display() {
		System.out.println("Player Details:");
		System.out.println("Player Name: "+name);
		System.out.println("Country Name: "+country);
		System.out.println("Skill Name: "+skill);
	}
}
public class Main1 {

	public static void main(String[] args) {
		Player1 p=new Player1();
		p.details();
		p.display();
	}

}
