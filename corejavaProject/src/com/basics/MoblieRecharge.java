package com.basics;

public class MoblieRecharge {

	public static void main(String[] args) {
		MoblieRecharge a = new MoblieRecharge();
		a.showPlanDetails();
		a.recharge(299);
		
	}	
	void showPlanDetails() {
		System.out.println("Current Recharge Plan ");
		System.out.println("Plan Unlimited : Unlimited 299");
		System.out.println("Validity : 28 days");
		System.out.println("Data : 1.5GB/day");
		System.out.println("Calls : Unlimited");

	}
	void recharge(double amount) {
		System.out.println("\nRecharge Successfully");
		System.out.println("Recharge amount:"+amount);
		
		
	}

}

