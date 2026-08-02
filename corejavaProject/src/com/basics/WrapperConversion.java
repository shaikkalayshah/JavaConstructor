package com.basics;

public class WrapperConversion {

	public static void main(String[] args) {
		String value = "1232";
		int n = Integer.parseInt(value);
		System.out.println(n);
		
		double doublevalue = Double.parseDouble(value);
		System.out.println(doublevalue);
		String value1 = "123.2";

		 float floatvalue = Float.parseFloat(value1);
		System.out.println(floatvalue);

	}

}
