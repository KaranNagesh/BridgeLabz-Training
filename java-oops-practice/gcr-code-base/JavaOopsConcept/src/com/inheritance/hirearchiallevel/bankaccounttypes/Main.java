package com.inheritance.hirearchiallevel.bankaccounttypes;

public class Main {
    public static void main(String[] args) {

    	//Creating object of different class
        SavingsAccount savings =
                new SavingsAccount(101, 10000, 4.5);

        CheckingAccount checking =
                new CheckingAccount(102, 15000, 5000);

        FixedDepositAccount fd =
                new FixedDepositAccount(103, 50000, 12);
        
        //Displaying account details
        savings.displayAccountType();
        checking.displayAccountType();
        fd.displayAccountType();
    }
}
