package org.fasttrackit.won14.curs7.homework7bank;

public class Main {
    public static void main(String[] args) {
        ING ingTransaction = new ING(5000);
        BT btTransaction = new BT(100);
        BRD brdTransaction = new BRD(9000);

        Person person1 = new Person("Joe", 30, ingTransaction);
        Person person2 = new Person("Jane", 18, btTransaction);
        Person person3 = new Person("Tom", 35, brdTransaction);

        person1.getBank().withdraw(500);
        person1.getBank().deposit(5000);
        System.out.println(person1.getName() + " has " + person1.getBank().moneyAvaiable() +"€ in the bank.");

        person2.getBank().deposit(100);
        System.out.println(person2.getName() + " has " + person2.getBank().moneyAvaiable() +"€ in the bank.");

        person3.getBank().withdraw(9000);
        System.out.println(person3.getName() + " has " + person3.getBank().moneyAvaiable() +"€ in the bank.");
    }
}
