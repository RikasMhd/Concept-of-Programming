enum CustomerType{PERSONAL,GROUP,COMPANY}
public class BankAccount{
    private String accountID,accountHolderName;
    private CustomerType customerType;
    protected double interestRate;
    private double annualCharges;
    private double balance=0;

    public BankAccount(String accountID,String accountHolderName,CustomerType customerType,double interestRate){
        this.accountID=accountID;
        this.accountHolderName=accountHolderName;
        this.customerType=customerType;
        this.interestRate=interestRate;

    if(customerType==CustomerType.COMPANY){
        this.annualCharges=5000;
    }
    else{
        this.annualCharges=1000;
    }
}

    public String  getAccountID(){
        return this.accountID;
    }
    public String  getAccountHolderName(){
        return this.accountHolderName;
    }
    public double getBalance(){
        return this.balance;
    }

    public void deposit(double deptAmount){
        balance+=deptAmount;
        System.out.println("Deposit : $"+deptAmount);
    }
    public void withdraw(double widAmount){
        if(this.balance>widAmount){
            this.balance-=widAmount;
            System.out.println("withdraw : $"+widAmount);
        }
        else{
            System.out.println("Amount Exceeded");
        }
    }

    public void transfer(double transAmount){
        if(this.balance>transAmount){
            this.balance-=transAmount;
            System.out.println("Transfer : $"+transAmount);
        }
        else{
            System.out.println("Amount Exceeded");
        }
    }
    public void showDetails(){
        System.out.println("Account ID :"+getAccountID());
        System.out.println("Account Holder Name :"+getAccountHolderName());
    }

}