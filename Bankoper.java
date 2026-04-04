class Bk {
    private double balance;
    public void deposit(double amount){
        if(amount > 0){
            balance+=amount;
        System.out.println("deposite:"+balance);

        }
    

    }
        public void withdraw(double amount){
            if(amount > 0 && amount<= balance){
                 balance-=amount;
                 System.out.println("withdraw:"+ amount);
            } else {
               System.out.println("Insuffient balance for withdraw:"+amount); 
            }

        }
            public double getBalance(){
                return balance;
            }
}

class Bankoper {
    public static void main(String[] args) {
       Bk bk=new Bk();
       bk.deposit(1000);
       bk.withdraw(800);
       bk.getBalance();

       System.out.println("Balance: " + bk.getBalance());
    }
}
