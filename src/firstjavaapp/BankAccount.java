
package firstjavaapp;

public class BankAccount {
    private double balance = 500;
    public void deposit( double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("");
        }
    }
    
}
    
