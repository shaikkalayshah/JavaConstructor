package LogicalStatements;

import java.util.Scanner;

public class LogSt1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		if(num>=10 && num<=99) {
			System.out.println("The number is two digit number");
		}
		else if(num>=100 & num<=999) {
			System.out.println("The number is three digit number");
		}
		else if(num>=1000) {
			System.out.println("The number is more than three digit number");
		}
		else {
			System.out.println("The number is less than two digit number");
		}
		sc.close();
	}

}
