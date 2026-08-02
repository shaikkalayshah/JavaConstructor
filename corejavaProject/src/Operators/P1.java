package Operators;

public class P1 {

	public static void main(String[] args) {
		int A = 10;
		int B = 20;
		
		System.out.println("Before swapping:");
		System.out.println("A:"+A);
		System.out.println("B:"+B);

		A = A^B;
		B = B^A;
		A = A^B;
		
		System.out.println("After swapping:");
		System.out.println("A:"+A);
		System.out.println("B:"+B);

	}

}
