package Operators;

import java.util.Scanner;

public class TernaryOp1 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks:");
		int a = sc.nextInt();
		
		String result =  ( a > 0 )?"Positive":"Negative"; 
		String Grades = (a>=90)?"A"
						:(a>=75)?"B"
						:(a>=60)?"C"
						:(a>=40)?"D":"Fail";
		System.out.println("The give number is  : "+result);
		System.out.println("The is Grades  : "+Grades);

		


	}

}
