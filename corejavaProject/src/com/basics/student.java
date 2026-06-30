package com.basics;

public class student {
	int STid;
	String STname;
	String STaddress;
	int STage;
	
	
	static int collegeid = 123;
	static String collegename = "Vcube";
	
	public static void main(String[] args) {
	
		System.out.println("--------------Student 1 info---------------");
		student shaik = new student();
		shaik.STid = 1;
		shaik.STname = "SHAIK KALAYSHAH";
		shaik.STaddress = "VIZAG";
		shaik.STage = 21;
		
		System.out.println("Colleg ID : " + collegeid);
		System.out.println("College Name : " + collegename);
		System.out.println("ID of the student : "+ shaik.STid);
		System.out.println("Name of the student : "+ shaik.STname);
		System.out.println("Address of the student : "+ shaik.STaddress);
		System.out.println("Name of the student : "+ shaik.STage);
		
		System.out.println("--------------Student 2 info---------------");
		student rakoti = new student();
		rakoti.STid = 2;
		rakoti.STname = "RAKOTI SHYAM SUNDAR";
		rakoti.STaddress = "VIZAG";
		rakoti.STage = 21;
		System.out.println("Colleg ID : " + collegeid);
		System.out.println("College Name : " + collegename);
		System.out.println("ID of the student : "+ rakoti.STid);
		System.out.println("Name of the student : "+ rakoti.STname);
		System.out.println("Address of the student : "+ rakoti.STaddress);
		System.out.println("Name of the student : "+ rakoti.STage);
	}

}
