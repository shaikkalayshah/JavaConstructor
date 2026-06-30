package com.basics;

public class Hello extends Object {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("main method started !");
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Class.forName("com.basics.emp");

		
		System.out.println("main method ended !");
		
	}

}
