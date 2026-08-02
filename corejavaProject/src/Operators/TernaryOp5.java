package Operators;

import java.util.Scanner;

public class TernaryOp5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value :");
		int a = sc.nextInt();
		
		System.out.println("Enter second value :");
		int b = sc.nextInt();
		
		System.out.println("Enter operator :");
		char op = sc.next().charAt(0);
		
		int result = (op=='+')?(a+b):(a-b);
	
		System.out.println("Result : "+result);
		
		sc.close();
	}

}
