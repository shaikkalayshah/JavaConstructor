package Constructor;
import java.util.*;

public class BankAcc {
	String accHolder;
	long accNumber;
	double balance;
	
	BankAcc(){
		this("unknow");
	}
	
	BankAcc(String accHolder){
		this(accHolder,0);
	}
	
	BankAcc(String accHolder,long accNumber){
		this(accHolder,accNumber,0.0);
	}
	
	BankAcc(String accHolder,long accNumber,double balance){
		this.accHolder = accHolder;
		this.accNumber = accNumber;
		this.balance = balance;
	}
	
	void display() {
		
		System.out.println("Account Holder : "+accHolder);
		System.out.println("Account Name : "+accNumber);
		System.out.println("Balance : "+balance);

	}
	
	
	public static void main(String[] args) {
		BankAcc b1 = new BankAcc();
		BankAcc b2 = new BankAcc("Krishna");
		BankAcc b3 = new BankAcc("Krishna",123456789);
		BankAcc b4 = new BankAcc("Krishna",123456789,3456789.23);

	}

}
