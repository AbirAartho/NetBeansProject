
package firstjavaapp;

public class SavingsAccount extends BankAccount {
    private double balance = 500;
    
    @Override
    public void withdraw(double amount) {
        if ((balance - amount) < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            balance -= amount;
        }
    }
    
    public void withdraw(double amount, int val) {
        if ((balance - amount) < 100) {
            System.out.println("Minimum balance of $100 required!");
        } else {
            balance -= amount;
        }
    }
}
