package com.basics;

public class CricketPlayer {
	int runs;
	String playername;
	
	static String teamname = "INDIA";

	public static void main(String[] args) {
		System.out.println("-----------Cricketer 1 info--------------");
		
		CricketPlayer msd = new CricketPlayer();
		msd.playername = "MS DHONI";
		msd.runs = 1000;
		System.out.println("Player name :" + msd.playername);
		System.out.println("Runs : " + msd.runs);
		System.out.println("Team name :" + teamname);
		
		System.out.println("-----------Cricketer 2 info--------------");
		CricketPlayer vk = new CricketPlayer();
		vk.playername = "VIRAT KOHLI";
		vk.runs = 1500;
		System.out.println("Player name :" + vk.playername);
		System.out.println("Runs : " + vk.runs);
		System.out.println("Team name :" + teamname);
		
		
		System.out.println("-----------Cricketer 3 info--------------");
		teamname="SOUTH AFRICA";
		CricketPlayer abd = new CricketPlayer();
		abd.playername = "AB DE VILLIERS";
		abd.runs = 1350;
		System.out.println("Player name :" + abd.playername);
		System.out.println("Runs : " + abd.runs);
		System.out.println("Team name :" + teamname);
		
		System.out.println("-----------Cricketer 4 info--------------");
		teamname="NEWZLAND";
		CricketPlayer kw = new CricketPlayer();
		kw.playername = "KANE WILLMSON";
		kw.runs = 1500;
		System.out.println("Player name :" + kw.playername);
		System.out.println("Runs : " + kw.runs);
		System.out.println("Team name :" + teamname);
		
		System.out.println("-----------Cricketer 5 info--------------");
		teamname="INDIA";
		CricketPlayer rs = new CricketPlayer();
		rs.playername = "ROHIT SHARMA";
		rs.runs = 1450;
		System.out.println("Player name :" + rs.playername);
		System.out.println("Runs : " + rs.runs);
		System.out.println("Team name :" + teamname);
		
	}

}
