package com.day3;

import java.util.Scanner;

class Delivery{
	long over;
	long balls;
	long runs;
	String batsman;
	String bowler;
	String nonstriker;
	
	public Delivery(long over, long balls, long runs, String batsman, String bowler, String nonstriker) {
		super();
		this.over = over;
		this.balls = balls;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonstriker = nonstriker;
	}
	
	public void displayDeliveryDetails() {
		System.out.println("Delivery Details:");
		System.out.println("Over:"+over);
		System.out.println("Balls:"+balls);
		System.out.println("Runs:"+runs);
		System.out.println("Batsman:"+batsman);
		System.out.println("Bowler:"+bowler);
		System.out.println("Nonstriker:"+nonstriker);
	}
}

public class Main3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long over;
		long balls;
		long runs;
		String batsman;
		String bowler;
		String nonstriker;
		System.out.println("Enter the over:");
		over=s.nextLong();
		System.out.println("Enter the balls:");
		balls=s.nextLong();
		System.out.println("Enter the runs:");
		runs=s.nextLong();
		System.out.println("Enter the Batsman:");
		batsman=s.nextLine();
		System.out.println("Enter the Bowler:");
		bowler=s.nextLine();
		System.out.println("Enter the nonstriker:");
		nonstriker=s.nextLine();
		
		Delivery d=new Delivery(over,balls,runs,batsman,bowler,nonstriker);
		d.displayDeliveryDetails();
	}

}
