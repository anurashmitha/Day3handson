package com.day3;

import java.util.*;
class ExtraType
{
	private String name ;
	private long runs;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRuns() {
		return runs;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	} 	
}
class Main5 {

	public static void main(String[] args) {
		ExtraType e=new  ExtraType();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the extratype details ");
		String str=s.next();
		System.out.println("Enter runs");
		long run=s.nextLong();
		e.setRuns(run);
		String []str1=str.split("#",2);
		for(String word:str1)
		{
			e.setName(word);
		}
		System.out.println("ExtraType Details ");
		System.out.println("Extra Type :"+e.getName()+"\n"+"Runs:"+e. getRuns());
		
		}

}