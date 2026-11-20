class Account {
    String holder;
    double balance;

    Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    void displayInfo() {
        System.out.println("Account holder name = " + holder);
        System.out.println("Account balance = " + balance);
    }
}
class Savingsaccount extends Account {
    double interestRate = 0.5;
    Savingsaccount(String h, double b) {
        super(h, b);
    }
    void displayInfo() {
        System.out.println("...Savingsaccount...");
        super.displayInfo();
        System.out.println( " Interest on saving = " + interestRate + "%, Profit= " + (balance * interestRate
                / 100));
    }
}
class Currentaccount extends Account {
    Currentaccount(String h, double b) {
        super(h, b);
    }
    void displayInfo() {
        System.out.println("...Currentaccount...");
        super.displayInfo();
        System.out.println(" no interest");
    }
}
public class Bank {
    public static void main(String[] args) {
        Account a = new Account("Alam", 50000);
        Savingsaccount s = new Savingsaccount("Ali", 20000);
        Currentaccount c = new Currentaccount("Mahmood", 80000);
        a.displayInfo();
        s.displayInfo();
        c.displayInfo();
    }
}
