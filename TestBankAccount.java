import java.util.ArrayList;
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount();
        BankAccount bankAccount2 = new BankAccount();
        //accounts
        bankAccount1.setCheckingBalance(200.00);
        bankAccount1.setSavingsBalance(400.00);
        bankAccount2.setCheckingBalance(350.00);
        bankAccount2.setSavingsBalance(600.00);

    System.out.println("number of accounts: " + bankAccount1.numAccounts);
    
    System.out.println("Checking 1 balance: $" + bankAccount1.displayChecking()); 
    System.out.println("Savings 1 balance: $" + bankAccount1.displaySavings()); 
    System.out.println("***********************"); 
    
    bankAccount1.addDepositToChecking(400.00);
    bankAccount1.addDepositToSavings(1100.00);
    
    System.out.println("***********New Balance************");

    System.out.println("Checking 1 balance: $" + bankAccount1.displayChecking()); 
    System.out.println("Savings 1 balance: $" + bankAccount1.displaySavings()); 

    System.out.println("***********************");

    bankAccount1.withdrawFromChecking(199.00);
    bankAccount1.withdrawFromSavings(412.00);
    
    System.out.println("************New Balance***********");

    System.out.println("Checking 1 balance: $" + bankAccount1.displayChecking()); 
    System.out.println("Savings 1 balance: $" + bankAccount1.displaySavings()); 

    System.out.println("***********************");

     
    System.out.println("Checking 2 balance: $" + bankAccount2.displayChecking()); 
    System.out.println("Savings 2 balance: $" + bankAccount2.displaySavings()); 

    System.out.println("***********************");

    System.out.println("all account total: $" + bankAccount1.totalAmount);
    }
}