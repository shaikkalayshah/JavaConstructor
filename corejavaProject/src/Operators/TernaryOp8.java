package Operators;

import java.util.Scanner;

public class TernaryOp8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee rating : ");
		int a = sc.nextInt();
		if(a>5 || a<0) {
			System.out.println("Invalid rating");
		}
		else {
		String bonus = (a>=4 )?"Eligible for bonus":"Not eligible for bonus";
		System.out.println(bonus);
		sc.close();
		}
	}

}
