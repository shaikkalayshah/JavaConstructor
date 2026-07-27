package Constructor;

public class Product {
	
	int productId;
	String productName;
	int price;
	
	Product (int productId, String productName, int price){
		
		this.productId = productId;
		this.productName= productName;
		this.price = price;
		
	}
	void show() {
		System.out.println("Product ID :"+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Price : "+price);
			}

	public static void main(String[] args) {
		
		Product p1 = new Product(101,"Laptop",55000);
		Product p2 = new Product(102,"Mobile",25000);
		p1.show();
		p2.show();


	}

}
