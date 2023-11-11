package org.fasttrackit.won14.curs7.homework7bank;

public class BRD implements Bank{
    private static final String NAME_OF_BANK = "BRD";
    private int moneyAvaiable;

    public BRD(int moneyAvaiable){
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
