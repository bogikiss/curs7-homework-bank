package org.fasttrackit.won14.curs7.homework7bank;

public interface Bank {
    String getName();
    Integer moneyAvaiable();
    void withdraw(Integer amountToWithdraw);
    void deposit(Integer amountToDeposit);
}
