package Constructor;

import java.util.Scanner;

public class Mobile {
	
	String company;
	String model;
	double price;
	
	Mobile(){
		this("Unknow");
	}
	
	Mobile(String company){
		this(company,"Unknow");
	}
	
	Mobile(String company,String model){
		this(company,model,0.0);
	}
	
	Mobile(String company,String model,double price){
		this.company=company;
		this.model=model;
		this.price=price;
	}
	 void display() {
	    	System.out.println("------Molibe Details-------");
	        System.out.println("Company: " + company);
	        System.out.println("Model: " + model);
	        System.out.println("Price: " + price);
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Company name:");
		String company = sc.nextLine();
		
		System.out.println("Enter the Model name:");
		String model = sc.nextLine();
		
		System.out.println("Enter the price:");
		double price = sc.nextDouble();
		
		Mobile m1 = new Mobile(company,model,price);
		
        m1.display();

	}

}
