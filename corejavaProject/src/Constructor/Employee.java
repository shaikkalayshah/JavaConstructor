package Constructor;

public class Employee {
	
	int empID;
	String empName;
	double salary;
	
	public Employee(int empID,String empName,double salary) {
		this.empID= empID;
		this.empName= empName;
		this.salary= salary;
	}
	Employee(Employee e){
		this.empID= e.empID;
		this.empName= e.empName;
		this.salary= e.salary;

	}
	
	void incrementSalary(double amount){
		salary = salary +amount;
	}
	
	void display() {
		System.out.println("EMPLOYEE ID:"+empID);
		System.out.println("NAME OF THE EMPLOYEE:"+empName);
		System.out.println("SALARY:"+salary);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Krishna",50000);
		Employee e2 = new Employee(e1);
		 e2.incrementSalary(10000);
		 e2.empName= "Ravi";
		 System.out.println("*********employee1*********");
		 e1.display();
		 
		 System.out.println("*********employee2*********");
		 e2.display();
		

	}

}
