package Operators;

import java.util.Scanner;

public class ArithmeticOp10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of Subject1 :");
		int s1 = sc.nextInt();
		System.out.println("Enter marks of Subject2 :");
		int s2 = sc.nextInt();
		System.out.println("Enter marks of Subject3 :");
		int s3 = sc.nextInt();
		System.out.println("Enter marks of Subject4 :");
		int s4 = sc.nextInt();
		System.out.println("Enter marks of Subject5 :");
		int s5 = sc.nextInt();
		
		int total = s1+s2+s3+s4+s5;
		System.out.println("Total marks of student :"+total);
		
		double avg =(s1+s2+s3+s4+s5)/5;
		System.out.println("Average marks of student :"+avg);
		
		double per = ((s1+s2+s3+s4+s5)/500.0)*100;
		System.out.println("Total marks of student :"+per+"%");


	}

}
