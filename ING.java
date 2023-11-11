package org.fasttrackit.won14.curs7.homework7bank;

public class ING implements Bank{
    private static final String NAME_OF_BANK = "ING";
    private int moneyAvaiable;

    public ING(int moneyAvaiable){
        this.moneyAvaiable = moneyAvaiable;
    }

    @Override
    public String getName() {
        return NAME_OF_BANK;
    }

    @Override
    public Integer moneyAvaiable() {
        return moneyAvaiable;
    }

    @Override
    public void withdraw(Integer amountToWithdraw) {
        this.moneyAvaiable = this.moneyAvaiable - amountToWithdraw;
    }

    @Override
    public void deposit(Integer amountToDeposit) {
        this.moneyAvaiable = this.moneyAvaiable + amountToDeposit;
    }
}
