package QuesPaper;




abstract class PayMent{
	abstract void pay();
	
	protected void connectBank() {
		System.out.println("Bank connnected.");
	}
	
	protected void transferMoney() {
		System.out.println("Money transferred successfully!!");
		
	}
}

class UPI extends PayMent{
	
	void pay() {
		verifyPin();
		connectBank();
		transferMoney();
		
		
	}
	
	private void verifyPin() {
		System.out.println("Credit Card: Pin verify.");
	}
}

class CreditCard extends PayMent{
	
	void pay() {
		verifyPin();
		connectBank();
		transferMoney();
		
		
	}
	
	private void verifyPin() {
		System.out.println("UPI: Pin verify.");
	}
}




public class MoneyPay {

	
	public static void main(String args[]) {
		PayMent p1=new UPI();
		p1.pay();
		
		PayMent p2=new CreditCard();
		p2.pay();
	}
}
