package QuesPaper;

 interface Debt{
	abstract void pay();
}

class UPI1 implements Debt{
	public void pay() {
		verifyPin();
		contactBank();
		transferMoney();
		
	}
	
	private void verifyPin() {
		System.out.println("UPI: Pin verified.");
		
	}
	private void contactBank() {
		System.out.println("Bank contacted.");
		
	}
	private void transferMoney() {
		System.out.println("Money transferred.");
		
	}	
	
}

public class PayMoney {
	public static void main(String args[]) {
		Debt P1 = new UPI1();
		P1.pay();	
		}
	
}
