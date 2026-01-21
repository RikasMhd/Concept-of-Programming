public class BankMain {
    public static void main(String[] args) {
        SavingAccount S1=new SavingAccount("SA123", "Alice", CustomerType.PERSONAL, 4.5);
        SavingAccount S2=new SavingAccount("SA456", "Bob", CustomerType.PERSONAL, 2.8);

        CurrentAccount C1=new CurrentAccount("CA2003", "XYZ Hardware", CustomerType.COMPANY, 6,1254,2379);
        CurrentAccount C2=new CurrentAccount("CA1234", "ABC Fisheries", CustomerType.COMPANY, 4,850,158);

        //Withdraw Money via SA 1
        S1.showDetails();
        S1.deposit(5000);
        S1.withdraw(2400);
        System.out.println("Balance in SA123: $"+S1.getBalance());

        System.out.println("");
        //Transfer Money via SA 2
        S2.showDetails();
        S2.deposit(8672);
        S2.transfer(2400);
        System.out.println("Balance in SA456 :$"+S2.getBalance());
        
        System.out.println("");
        //When chequeStartNo<=chequeNo<=chequeEndNo
        C1.showDetails();
        C1.depositCheque("CA123",1500,"CAN2000",2358104);
        System.out.println("Balance in CA123: $"+C1.getBalance());

        System.out.println("");
        //When chequeStartNo<=chequeNo>=chequeEndNo
        C2.showDetails();
        C2.depositCheque("CA456",1000,"CAN2000",8754);
        System.out.println("Balance in CA456: $"+C2.getBalance());


    }
}
