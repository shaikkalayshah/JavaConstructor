package com.basics;

public class Bike {

	@Override
		protected void finalize() throws Throwable {
			System.out.println("Garbage collector is called");
		}
	static int count = 0;	{
		count++;
	}

	public static void main(String[] args) {
		
		Bike fz = new Bike();
		Bike re = new Bike();
		Bike r1 = new Bike();
		Bike hero = new Bike();
		Bike pl = new Bike();
		
		System.out .println(fz);
		System.out .println(re);
		System.out .println(r1);
		System.out .println(hero);
		System.out .println(pl);

		
		fz = null ;
		re = hero;
		
		System.out .println("object are eligible");
		
		System.gc();

		
		System.out .println("Number of object :" + count);

		

	}

}
