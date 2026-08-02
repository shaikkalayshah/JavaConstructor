package Operators;

import java.util.Scanner;

public class TernaryOp4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
		
		ch = Character.toUpperCase(ch);
		String result = (ch == 'A' || ch == 'E'||ch == 'I' || ch == 'O'||ch == 'U')?"Vowels":"Consonant";
		System.out.println("result:"+result);
		sc.close();
	}
}
