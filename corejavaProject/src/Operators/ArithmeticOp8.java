package Operators;

import java.util.Scanner;

public class ArithmeticOp8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal amount :");
		int pa = sc.nextInt();
		System.out.println("enter rate of interest : ");
		int rate = sc.nextInt();
		System.out.println("enter time (years) : ");
		int time = sc.nextInt();
		
		double si = (pa*rate*time)/100;
		System.out.println("simple interest : "+si);
		
		sc.close();
		
	}

}
