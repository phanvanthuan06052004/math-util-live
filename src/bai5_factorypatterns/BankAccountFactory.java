/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5_factorypatterns;

/**
 *
 * @author ACER
 */
public class BankAccountFactory {
    public static IBankAccount createBankAccount(String accountType) {
        IBankAccount account = null;
        switch(accountType.toLowerCase()) {
            case "savings" -> account = new SavingsAccount();
            case "current" -> account = new CurrentAccount();
            default -> throw new IllegalArgumentException("Invalid account type: " + accountType);
        }
        return account;
    }
}
