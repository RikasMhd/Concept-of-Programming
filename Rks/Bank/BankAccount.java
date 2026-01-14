public class BankAccount {
    private String accountID,accountHolderName,CustomerType;
    protected double interestRate;
    private double annualCharges,balance;

    public BankAccount(String accountID,String accountHolderName,String CustomerType,double interestRate,double annualCharges,double balance){
        this.accountID=accountID;
        this.accountHolderName=accountHolderName;
        this.CustomerType=CustomerType;
        this.interestRate=interestRate;
        this.annualCharges=annualCharges;
        this.balance=balance;
    }
    public void deposit(double depAmount){
        this.balance+=depAmount;      
    }
    public void withdraw(double widAmount){
        if(this.balance>widAmount){
            this.balance-=widAmount;
        }
        else{
            System.out.println("Balance Exceeded");
        }   
    }
    public void transfer(double transAmount){
        this.balance-=transAmount;
    }
}
