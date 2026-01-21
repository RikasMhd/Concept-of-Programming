public class CurrentAccount extends BankAccount{
    private int chequeStartNo,chequeEndNo;

    public CurrentAccount(String accountID,String accountHolderName,CustomerType customerType,double interestRate,int chequeStartNo,int chequeEndNo){
        super(accountID,accountHolderName,customerType,interestRate);
        this.chequeStartNo=chequeStartNo;
        this.chequeEndNo=chequeEndNo;
    }
    public void depositCheque(String accountID,int chequeNo,String chequeAccountNum,double amount){
        if(chequeStartNo<=chequeNo && chequeNo<=chequeEndNo){
            deposit(amount);
        }
        else{
            System.out.println("Cheque Not Valid.");
        }
    }
}
