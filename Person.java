package org.fasttrackit.won14.curs7.homework7bank;

public class Person {
    private String name;
    private Integer age;
    private Bank bank;

    public Person(String name, Integer age, Bank bank){
        this.name = name;
        this.age = age;
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Bank getBank() {
        return bank;
    }
}
