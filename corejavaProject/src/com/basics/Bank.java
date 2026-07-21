package com.basics;

import java.util.Scanner;

public class Bank {
	double calculateInterest(double principal,double rate,int time) {
		return (principal*rate*time)/100;
	}
	void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the principal amount:");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the rate of interest:");
		double rate = sc.nextDouble();
		
		System.out.println("Enter time in years:");
		int time = sc.nextInt();
		
		double result;
		result = calculateInterest (principal,rate,time);
		
		System.out.println("Simple interest : " +result);
		
	}

}
