package com.basics;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main method started");
		method2();
		method1();

	}
	
	static void method1(){
		System.out.println("method1");
	}
	
	static void method2() {
		Test m = new Test();
		m.method4();
		System.out.println("method2");
		
	}
	
	void method3(){
		System.out.println("method3");
	}
	
	 void method4() {
		System.out.println("method4");
		method3();
	}

}
