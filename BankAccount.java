import java.util.ArrayList;
public class BankAccount {
    //attributes
    public static int numAccounts = 0;
    public static double totalAmount;
    private double checkingBalance;
    private double savingsBalance;

    //constructor
    public BankAccount () {
        numAccounts++;
        totalAmount = this.checkingBalance+this.savingsBalance;
    }

    public BankAccount(double checkingBalance, double savingsBalance) {
        this.checkingBalance = 200.00;
        this.savingsBalance = 500.00;
        numAccounts++;
        totalAmount = this.checkingBalance+this.savingsBalance;
    }


    //getters and setters
        public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public void setCheckingBalance(double checkingBalance) {
        totalAmount -= this.checkingBalance;
        totalAmount += checkingBalance;
        this.checkingBalance = checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public void setSavingsBalance(double savingsBalance) {
        totalAmount -= this.savingsBalance;
        totalAmount += savingsBalance;
        this.savingsBalance = savingsBalance;
    }

    public int getNumAccounts(){
        return this.numAccounts;
    }
    public double getTotalAmount(){
        return this.totalAmount;
    }

    //methods
    public double displayChecking() {
        return this.checkingBalance;
    }
    public double displaySavings() {
        return this.savingsBalance;
    }

     public double addDepositToChecking(double deposit){
        System.out.println("Depsited: $" + deposit + " to checking");
        totalAmount += deposit;
        return this.checkingBalance += deposit;
    }
     public double addDepositToSavings(double deposit){
        System.out.println("Depsited: $" + deposit + " to savings");
        totalAmount += deposit;
        return this.savingsBalance += deposit;
    }

     public double withdrawFromChecking(double withdraw){
        System.out.println("Withdraw: $" + withdraw + " from Checking");
        totalAmount -= withdraw;
        return this.checkingBalance -= withdraw;
    }

     public double withdrawFromSavings(double withdraw){
        System.out.println("Withdraw: $" + withdraw + " to savings");
                totalAmount -= withdraw;
        return this.savingsBalance -= withdraw;
    }
}