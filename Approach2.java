package com.tns.sample;

public class Approach2 {
	String batsman="virat kohili";
	static String bowler="Bhuvi";
	void display() {
		System.out.println("cricket");
		}
	static String display1() {
		return "teams";
	}
}
class Access
{ 
	public static void main(String[] args)
	{
		Approach2 A2=new Approach2();
		System.out.println(A2.batsman);
		System.out.println(Approach2.bowler);
		A2.display();
		Approach2.display1();
	}
}
