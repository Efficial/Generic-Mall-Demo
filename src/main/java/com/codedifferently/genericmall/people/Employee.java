package com.codedifferently.genericmall.people;

public class Employee<T> extends Staff<T>{
    private T itemType;

    public Employee(String firstName, String lastName, Integer age, T itemType) {
        super(firstName, lastName, age, itemType);
    }
    public String greeting() {
        String output = String.format("Hello I sell items of type %s", itemType);
        return output;
    }
}
