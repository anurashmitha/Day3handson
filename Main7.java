package com.day3;

import java.util.*;

class Deliveryy
{
	private Long over;
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public String getNonStriker() {
		return nonStriker;
	}
	public void setNonStriker(String nonStriker) {
		this.nonStriker = nonStriker;
	}
	
	private Long ball;
	private Long runs;
	private String batsman;
	private String bowler;
	private String nonStriker;
	 Deliveryy(Long over, Long ball,Long runs,String batsman,String bowler,String nonStriker)
	 {
		 this.over=over;
		 this.ball=ball;
		 this.runs=runs;
		 this.batsman=batsman;
		 this.bowler=bowler;
		 this.nonStriker=nonStriker;
		 
	 }
	 Deliveryy(){
		 
	 }
}
public class Main7 {

	public static void main(String[] args) {
		Deliveryy d=new  Deliveryy();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Over");
		Long over1=s.nextLong();
		d.setOver(over1);
		System.out.println("Enter the ball");
	    Long ball1=s.nextLong();
		d.setBall(ball1);
		System.out.println("Enter the runs");
	    Long run1=s.nextLong();
		d. setRuns(run1);
		System.out.println("Enter the batsman name");
		String batsman1=s.next();
		d.setBatsman(batsman1);
		System.out.println("Enter the bowler name");
		String bowler1=s.next();
		d.setBowler(bowler1);
		System.out.println("Enter the nonStriker name");
		String nonstrike=s.next();
		d.setNonStriker(nonstrike);
		Deliveryy de=new Deliveryy(over1,ball1,run1,batsman1,bowler1,nonstrike);
		System.out.println("Over :"+de.getOver()+"\n"+"Ball :"+de.getBall()+"\n"+"Runs :"+de.getRuns()
		          +"\n"+"Batsman Name:"+de.getBatsman()+"\n"+"Bowler:"+de.getBowler()+"\n"+"NonStriker:"+de.getNonStriker());
		

	}

}

