package com.basics;

public class F1 {
	int driverage;
	String drivername;
	String teamname;
	int carno;
	
	static int countryid;
	static String countryname;
	
	public static void main(String[] args) {
		System.out.println("F1 - THE OFFICAL HOME OF FORMALA 1 RACING ");
		System.out.println("-----------DRIVER 1 info--------------");
		
		
		countryid = 1;
		countryname = "England";
		F1 lh = new F1();
		lh.driverage = 41;
		lh.drivername = "LEWIS HAMILTON";
		lh.teamname = "FERRARI";
		lh.carno = 44;
		System.out.println("Driver name :" + lh.drivername);	
		System.out.println("Team :" + lh.teamname);
		System.out.println("Age of Driver :" + lh.driverage);
		System.out.println("Country ID :" + countryname);
		System.out.println("Country Name :" + countryid);
		
		System.out.println("-----------DRIVER 2 info--------------");
		
		F1 ln = new F1();
		ln.driverage = 26;
		ln.drivername = "LANDO NORRIS";
		ln.teamname = "MCLAREN";
		ln.carno = 4;
		System.out.println("Driver name :" + ln.drivername);
		System.out.println("Team :" + ln.teamname);
		System.out.println("Age of Driver :" + ln.driverage);
		System.out.println("Country ID :" + countryname);
		System.out.println("Country Name :" + countryid);
		
		System.out.println("-----------DRIVER 3 info--------------");
		
		F1 gr = new F1();
		gr.driverage = 28;
		gr.drivername = "GEORGE RUSSELL";
		gr.teamname = "MERCEDES";
		gr.carno = 63;
		System.out.println("Driver name :" + gr.drivername);
		System.out.println("Team :" + gr.teamname);
		System.out.println("Age of Driver :" + gr.driverage);
		System.out.println("Country ID :" + countryname);
		System.out.println("Country Name :" + countryid);
		
		System.out.println("-----------DRIVER 4 info--------------");
		
		countryid = 23;
		countryname = "Netherlands";
		F1 mv = new F1();
		mv.driverage = 28;
		mv.drivername = "MAX VERSTAPPEN";
		mv.teamname = "RED BULL RACING";
		mv.carno = 1;
		System.out.println("Driver name :" + mv.drivername);
		System.out.println("Team :" + mv.teamname);
		System.out.println("Age of Driver :" + mv.driverage);
		System.out.println("Country ID :" + countryname);
		System.out.println("Country Name :" + countryid);
		
		System.out.println("-----------DRIVER 5 info--------------");
		
		countryid = 42;
		countryname = "Monaco";
		F1 cl = new F1();
		cl.driverage = 26;
		cl.drivername = "CHARLES LECLERC";
		cl.teamname = "FERRARI";
		cl.carno = 16;
		System.out.println("Driver name :" + cl.drivername);
		System.out.println("Team :" + cl.teamname);
		System.out.println("Age of Driver :" + cl.driverage);
		System.out.println("Country ID :" + countryname);
		System.out.println("Country Name :" + countryid);

	}

}
