package Operators;

import java.util.Scanner;

public class TernaryOp2 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number:");
	int a = sc.nextInt();
	String eo = (a%2<=0)?"even":"odd";
	System.out.println("The give number is : "+eo);

	}

}
