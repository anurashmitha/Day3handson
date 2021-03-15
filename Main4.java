package com.day3;

import java.util.Scanner;

class Venue1
{
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
public class Main4 {
	static String option;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Venue1 v=new Venue1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the venue name");
		String venueName=sc.next();
		v.setName(venueName);
		System.out.println("Enter the city name");
		String cityName=sc.next();
		v.setCity(cityName);
		System.out.println("Venue Details");
		System.out.println("Venue Name :"+v.getName()+"\n"+"City Name :"+v.getCity());
		do
		{
		System.out.println("Menu");
		System.out.println("1.Update Venue Name");
		System.out.println("2.Update City Name");
		System.out.println("3.All information Correct/Exit");
		System.out.println("Type 1 or 2 or 3");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: System.out.println("Enter Venue Name");
		        String venueupdName=sc.next();
		        v.setName(venueupdName);
				System.out.println("Venue Name :"+v.getName()+"\n"+"City Name :"+v.getCity());
				break;
		case 2: System.out.println("Enter Venue Name");
        		String city2=sc.next();
        		v.setCity( city2);
        		System.out.println("Venue Name :"+v.getName()+"\n"+"City Name :"+v.getCity());
        		break;
		case 3: System.out.println("Venue Name :"+v.getName()+"\n"+"City Name :"+v.getCity());
		        break;
		 default :System.out.println("Enter correct choice");
		
		 
		    }
		 System.out.println("Do u want to make any updation please enter y/Y ");
		 option=sc.next();
		}while(option.equals("y")||option.equals("Y"));
		
		
	}

}

