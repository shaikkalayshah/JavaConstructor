package Operators;

import java.util.Scanner;

public class TernaryOp6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value :");
		int a = sc.nextInt();
		
		String result = (a%5<=0)?"Divisible by 5":"Not Divisible by 5";
		System.out.println(result);
		sc.close();

	}

}
