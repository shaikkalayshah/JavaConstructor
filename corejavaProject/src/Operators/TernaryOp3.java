package Operators;

import java.util.Scanner;

public class TernaryOp3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		String categorize = (age<13)?"child"
							:(age<25)?"teenager"
							:(age<45)?"adult":"senior citizen";
		System.out.println("Categorize : "+categorize);

	}

}
