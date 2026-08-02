package Operators;

import java.util.Scanner;

public class ArithmeticOp6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter frist Number:");
		int a = sc.nextInt();
		System.out.println("Enter second Number:");
		int b = sc.nextInt();
		System.out.println("Enter third Number:");
		int c = sc.nextInt();
		
		System.out.println("Average of three number : "+(a+b+c)/3);
	}

}
