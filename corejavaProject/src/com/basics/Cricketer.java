package com.basics;

public class Cricketer {
	int JeseryNo;
	int Cricketerage;
	String Cricketername;
	String Role;
	
	
	static int countryid = 91;
	static String countryname = "India";

	public static void main(String[] args) {
		System.out.println("Welcome to India Team ");
		System.out.println("-----------Cricketer 1 info--------------");
		
		Cricketer msd = new Cricketer();
		msd.JeseryNo = 7;
		msd.Cricketerage = 44;
		msd.Cricketername = "MS DHONI";
		msd.Role = "Right hand batsmen and wicket keeper";
		System.out.println("Cricketer name :" + msd.Cricketername);
		System.out.println("Jesery number :" + msd.JeseryNo);
		System.out.println(" Role :" + msd.Role);
		System.out.println("Age of Cricketer :" +msd.Cricketerage);
		System.out.println("Country ID :" + countryname);
		System.out.println("Country Name :" + countryid);
		
        System.out.println("-----------Cricketer 2 info--------------");
		
		Cricketer vk = new Cricketer();
		vk.JeseryNo = 18;
		vk.Cricketerage = 37;
		vk.Cricketername = "VIRAT KOHLI";
		vk.Role = "Right hand batsmen";
		System.out.println("Cricketer name :" + vk.Cricketername);
		System.out.println("Jesery number :" + vk.JeseryNo);
		System.out.println("Role :" + vk.Role);
		System.out.println("Age of Cricketer :" + vk.Cricketerage);
		System.out.println("Country ID :" + countryname);
		System.out.println("Country Name :" + countryid);
				
		 System.out.println("-----------Cricketer 3 info--------------");
			
		 countryid = 92;
		 countryname = "Bharath";
			Cricketer rs = new Cricketer();
		    rs.JeseryNo = 45;
			rs.Cricketerage = 39;
			rs.Cricketername = "ROHIT SHARMA";
			rs.Role = "Right hand batsmen";
			System.out.println("Cricketer name :" + rs.Cricketername);
			System.out.println("Jesery number :" + rs.JeseryNo);
			System.out.println("Role :" + rs.Role);
			System.out.println("Age of Cricketer :" + rs.Cricketerage);
			System.out.println("Country ID :" + countryname);
			System.out.println("Country Name :" + countryid);
			
			System.out.println("-----------Cricketer 4 info--------------");
			
			 countryid = 92;
			 countryname = "Bharath";
				Cricketer js = new Cricketer();
			    js.JeseryNo = 93;
				js.Cricketerage = 32;
				js.Cricketername = "JASPRIT BUMRAH";
				js.Role = "Right hand bowler";
				System.out.println("Cricketer name :" + js.Cricketername);
				System.out.println("Jesery number :" + js.JeseryNo);
				System.out.println("Role :" + js.Role);
				System.out.println("Age of Cricketer :" + js.Cricketerage);
				System.out.println("Country ID :" + countryname);
				System.out.println("Country Name :" + countryid);
				
				System.out.println("-----------Cricketer 5 info--------------");
				
				 countryid = 92;
				 countryname = "Bharath";
					Cricketer hp = new Cricketer();
				    hp.JeseryNo = 33;
					hp.Cricketerage = 32;
					hp.Cricketername = "HARDIK PANDYA";
					hp.Role = "Right hand All rounder";
					System.out.println("Cricketer name :" + hp.Cricketername);
					System.out.println("Jesery number :" + hp.JeseryNo);
					System.out.println("Role :" + hp.Role);
					System.out.println("Age of Cricketer :" + hp.Cricketerage);
					System.out.println("Country ID :" + countryname);
					System.out.println("Country Name :" + countryid);
			
		
				

	}

}
