package QuesPaper;

class PrimeThread extends Thread{
	
	boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}else {
			for(int i=2; i<=n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public void run() {
		try {
			for(int i=1;i<=500;i++) {
				if(isPrime(i)) {
					System.out.println(i);
					Thread.sleep(3000);
				}
			}
		} catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	
}

public class PrimeNumbers{
	public static void main(String args[]) {
		PrimeThread pt=new PrimeThread();
		pt.start();
	}
}
