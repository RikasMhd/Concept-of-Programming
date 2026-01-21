                                                                          Bank Que:
                                                                          
Bank Account
Private AccountID
Private AccountHolderName
Private CustomerType = {Personal, Group, Company}
Protected InterestRate
Private AnnualCharges = Personal/Group 1000.00, Company 5000)
Private Balance

Methods
Public Deposit
Public Withdraw (if the balance is enough)
Public Transfer
..
..

SavingsAccount - child of bank account 

CurrentAccount - child of bank account 
ChequeNoStart
ChequeNoEnd

DepositCheque(AccountID, ChequeNo, ChequeAccountNo, amount)
Credit the amount if (ChequeNostart<=chequeno<=ChequeNoEnd) 



Exception Handling :https://www.geeksforgeeks.org/java/exceptions-in-java/
