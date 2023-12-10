// Encapsulation with real world example
class BankAccount {
    
    // private attribute for encapsulation
    private String AccountNumber;
    private double AccountBalance;
    private String AccountHolder;
    
    // contructor to initialize the attirbutes
    public BankAccount(String AccountNumber, double AccountBalance, String AccountHolder) {
        this.AccountNumber = AccountNumber;
        this.AccountBalance = AccountBalance;
        this.AccountHolder = AccountHolder;
    }
    
    // getter methods for encapsulation
    public String getAccountNumber() {
        return AccountNumber;
    }
    public double getAccountBalance() {
        return AccountBalance;
    }
    public String getAccountHolder() {
        return AccountHolder;
    }
    
    // setter method for encpsulation with validation
    public void setAccountBalance(double AccountBalance) {
        if(AccountBalance >= 0) {
            this.AccountBalance = AccountBalance;
        }else {
            System.out.println("Invalid Balance, Balance Cannot be Negative!");
        }
    }
    
    // method to deposit money
    public void depositMoney(double amount) {
        if(amount > 0) {
            this.AccountBalance += amount;
            System.out.println("Deposit Money rs " + amount + " Successfull. New Balance is " + this.AccountBalance);
        } else {
            System.out.println("Invalid Amount for deposit!");
        }
    }
    
    // method to withdraw money with validation
    public void withdrawMoney(double amount) {
        if(amount > 0 && amount <= this.AccountBalance) {
            this.AccountBalance -= amount;
            System.out.println("Withdraw money rs " + amount + " Successfull. New Balance is " + this.AccountBalance);
        } else {
            System.out.println("Insufficient Balance Cannot Withdraw Money!");
        }
    }
    
    
    public static void main(String[] args) {
        
        BankAccount ba = new BankAccount("89279823700", 1000.90, "Mohd Saif");
        
        // access attributes through getter methods
        System.out.println("Account Holder : " + ba.getAccountHolder());
        System.out.println("Account Number : " + ba.getAccountNumber());
        System.out.println("Account Balance : " + ba.getAccountBalance());
        
        
        // deposit and withdraw money
        ba.depositMoney(500.65);
        ba.withdrawMoney(300.65);
        
        // attempt to set invalid balance
        ba.setAccountBalance(-100.0);
        
    }
}
