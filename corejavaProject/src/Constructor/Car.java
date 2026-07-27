package Constructor;

public class Car {
	
	String model;
	String brand;
	String colour;
	double price;
	int year;
	
	public Car() {
		model = "unknow";
		brand = "unknow";
		colour = "unknow";
		price = 300000.00;
		year = 2019;		
	}
	

	public Car(String model, String brand, String colour, double price, int year) {
		super();
		this.model = model;
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.year = year;
	}
	
	public Car(String model, String brand, String colour, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.colour = colour;
		this.price = price;
	}
	

	public Car(String model, String brand, String colour) {
		super();
		this.model = model;
		this.brand = brand;
		this.colour = colour;
	}


	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Car c1 = new Car("xyz","BMW","BLACK",4500000.00,2024);
		c1.carinfo();
		
		Car c2 = new Car("abc","BMW","WHITE",4000000.00,2020);
		c2.carinfo();
		
		Car c3 = new Car("def","ferrai","RED",5500000.00);
		c3.carinfo();
		
		Car c4 = new Car();
		c4.carinfo();
				
	}

	void carinfo() {
		System.out.println("Model of the car:"+model);
		System.out.println("Brand of the car:"+brand);
		System.out.println("Price of the car:"+price);
		System.out.println("Colour of the car:"+colour);
		System.out.println("Year of the car:"+year);
		System.out.println("*****************************************************************");

	}
}
