package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankAccountTest{

   double accountBalance = 300;
   double  amount = 100;
    @Test
   void deposit(){
        this.accountBalance += amount;
        System.out.println("My account deposit " + amount + " balance: "+ this.accountBalance);

        assertEquals("My account deposit 100.0 balance: 400.0", "My account deposit " + amount + " balance: "+ this.accountBalance);
    }
}