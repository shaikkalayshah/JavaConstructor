package Constructor;

import java.util.Scanner;

public class Movie {
		
	String movieName;
	String hero;
	double rating;
	
	Movie(){
		this("Unknow");
	}
	
	Movie(String movieName){
		this(movieName,"Unknow");
	}
	
	Movie(String movieName, String hero){
		this(movieName,hero,0.0);
	}
	
	Movie(String movieName, String hero,double rating){
		this.movieName = movieName;
		this.hero = hero;
		this.rating = rating;
	}
	
	void display() {
    	System.out.println("------Student details-------");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Hero: " + hero);
        System.out.println("Rating: " + rating);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Movie name:");
		String movieName = sc.nextLine();
		
		System.out.println("Hero of the movie:");
		String hero = sc.nextLine();
		
		System.out.println("Rating the movie:");
		double rating = sc.nextDouble();
		
		Movie m1 = new Movie(movieName,hero,rating);
		
        m1.display();
	}

}
