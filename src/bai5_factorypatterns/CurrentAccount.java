/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_factorypatterns;

import java.math.BigDecimal;

/**
 *
 * @author ACER
 */
public class CurrentAccount implements IBankAccount{
   private BigDecimal balance = BigDecimal.ZERO;

    @Override
    public void deposit(BigDecimal amount) {
        balance = balance.add(amount);
    }

    @Override
    public void displayBalance() {
        System.out.println("Current Account Balance: " + balance);
    }  
}
