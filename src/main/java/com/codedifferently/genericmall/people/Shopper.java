package com.codedifferently.genericmall.people;

public abstract class Shopper <T> extends Person{
    private T item;

    public Shopper(String firstName, String lastName, Integer age, T item) {
        super(firstName, lastName, age);
        this.item = item;
    }

    public String greeting() {
        return "Yes, I am here to purchase a " + item;
    }
}
