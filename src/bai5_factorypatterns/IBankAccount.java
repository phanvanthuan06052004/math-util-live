/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bai5_factorypatterns;

import java.math.BigDecimal;

/**
 *
 * @author ACER
 */
public interface IBankAccount {
    void deposit(BigDecimal amount);
    void displayBalance();
}
