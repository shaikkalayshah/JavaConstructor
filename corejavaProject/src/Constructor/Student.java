package Constructor;

import java.util.Scanner;

public class Student {
	
	String name;
	int rollNo;
	double marks;
	
	Student(){
		this("Unknown");
	}
	
	Student(String name){
		this(name,0);
	}
	
	Student(String name, int rollNo){
		 this(name,rollNo,00.0);
	}
	
	Student(String name, int rollNo,double marks){
		this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
    	System.out.println("------Student details-------");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name:");
		String name = sc.nextLine();
		
		System.out.println("Enter the roll number:");
		int rollNo = sc.nextInt();
		
		System.out.println("Enter the marks:");
		double marks = sc.nextDouble();
		
		Student s1 = new Student(name,rollNo,marks);
		
        s1.display();
	}

}
