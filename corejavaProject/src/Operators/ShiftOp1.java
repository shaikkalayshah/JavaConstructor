package Operators;

import java.util.Scanner;

public class ShiftOp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number:");
		int a = sc.nextInt();
		System.out.println("Enter Second Number:");
		int b = sc.nextInt();
		
		System.out.println("left shift :"+(a<<b));
		System.out.println("right shift :"+(a>>b));




	}

}
