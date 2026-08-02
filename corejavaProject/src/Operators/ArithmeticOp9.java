package Operators;

import java.util.Scanner;

public class ArithmeticOp9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length:");
		int len = sc.nextInt();
		System.out.println("Enter width:");
		int wid = sc.nextInt();
		
		int area = len*wid;
		System.out.println("Area of the rectangle : "+area);
		
		int perimeter = 2*(len+wid);
		System.out.println("Perimeter of the rectangle : "+perimeter);
		
		sc.close();


	}

}
