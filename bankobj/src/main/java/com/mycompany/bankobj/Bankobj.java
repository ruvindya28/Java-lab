package com.mycompany.bankobj;
public class Bankobj 
{

    public static void main(String[] args) 
    {
        BankAccount CheckingAccount = new CheckingAccount(100000,524166);
        BankAccount SavingAccount = new SavingAccount(20000,586921);

 

        System.out.println("Interest for Checking Account: Rs :" + CheckingAccount.calculateInterest());
        System.out.println("Interest for Saving Account: Rs :" + SavingAccount.calculateInterest());

    }
}

