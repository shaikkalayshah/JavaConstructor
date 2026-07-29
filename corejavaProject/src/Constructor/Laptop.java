package Constructor;

import java.util.Scanner;

public class Laptop {
	
	String model;
	String brand;
	Double price;
	
	Laptop(){
		this("Unknow");
	}
	
	Laptop(String model){
		this(model,"Unknow");
	}
	
	Laptop(String model,String brand){
		this(brand,model,0.0);
	}
	
	Laptop(String brand,String model,double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	 void display() {
	    	System.out.println("------Laptop Details-------");
	        System.out.println("Company: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Price: " + price);
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Brand name:");
		String brand = sc.nextLine();
		
		System.out.println("Enter the Model name:");
		String model = sc.nextLine();
		
		System.out.println("Enter the price:");
		double price = sc.nextDouble();
		
		Laptop m1 = new Laptop(brand,model,price);
		
        m1.display();

	}

}
