package Operators;

import java.util.Scanner;

public class TernaryOp7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks :");
		int marks = sc.nextInt();
		String result = (marks>=90)?"A":(marks>=75)?"B":(marks>=60)?"C":(marks>=45)?"D":"F";
		
		System.out.println("Grade : "+result);
		sc.close();
		
		
	}

}
