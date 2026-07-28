package Constructor;

public class Vehicle {
	
	String model = "classic";
	String brand = "re";
	double price = 300000.00;

	public static void main(String[] args) {
		System.out.println("main method started from vehicle");

	}
	
}


class Bike1 extends Vehicle{
	String model = "gt650";
	String brand = "re";
	double price = 475000.00;
	public static void main(String[] args) {
		System.out.println("main method started from bike");
		Bike1 b1 = new Bike1();
		Bike1 b2 = new Bike1();
		b1.vehicleInfo1();
		b2.vehicleInfo2();
	}
	void vehicleInfo1() {
		System.out.println("model of vehicle :"+super.model);
		System.out.println("brand of vehicle :"+super.brand);
		System.out.println("price of vehicle :"+super.price);
		System.out.println("-----------------------------------");

	}
	
	void vehicleInfo2() {
		System.out.println("model of vehicle :"+this.model);
		System.out.println("brand of vehicle :"+this.brand);
		System.out.println("price of vehicle :"+this.price);
		System.out.println("-----------------------------------");


	}
}