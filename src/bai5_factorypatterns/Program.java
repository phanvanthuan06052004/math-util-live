/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5_factorypatterns;

import java.math.BigDecimal;

/**
 *
 * @author ACER
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IBankAccount savings = BankAccountFactory.createBankAccount("savings");
        savings.deposit(new BigDecimal("1500"));
        savings.displayBalance();

        IBankAccount current = BankAccountFactory.createBankAccount("current");
        current.deposit(new BigDecimal("1000"));
        current.displayBalance();
    }
    
}
