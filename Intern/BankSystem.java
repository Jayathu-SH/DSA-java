class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw : " +amount);
        }else {
            System.out.println("Insufficient balance");
        }
    }

    public void displayBalance() {
        System.out.println("Account : " +accountNumber+ ", Balance: " +balance);
    }
}

class SavingsAccount extends BankAccount {
    final double MIN_BALANCE =1000;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdraw from Savings : "+ amount);
        }else {
            System.out.println("Can't go below minimum balance");
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn from Current: " + amount);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("S001", 5000);
        BankAccount acc2 = new CurrentAccount("C001", 2000);

        acc1.withdraw(4500);  
        acc2.withdraw(2500);  

        acc1.displayBalance();
        acc2.displayBalance();
    }
}
