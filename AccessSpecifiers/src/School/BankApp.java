package School;

abstract class BankAccount {
	abstract void withdraw();
	abstract void deposit();
	
}

class SBIAccount extends BankAccount{
	
	private int rewardValue=0;
	
	public void withdraw() {
		System.out.println("withdraw amount from SBI");
		
	}
	
	public void deposit() {
		System.out.println("deposite amount from SBI");
		
	}
	protected void checkSBIRewards() {
		rewardValue += 10;
		System.out.println("Reward Added..."+ rewardValue);
		
	}
}

public class BankApp {
	public static void main(String[] args) {
		BankAccount BK = new SBIAccount();
		BK.withdraw();
		BK.deposit();
	}
}
