package com.codedifferently.genericmall.people;

public class Customer<T> extends Shopper<T>{
    private T item;

    public Customer(String firstName, String lastName, Integer age, T item) {
        super(firstName, lastName, age, item);
    }

    public String purchase(){
        return "Yes, I am here to purchase a " + item;
    }

}
