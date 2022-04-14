package com.codedifferently.genericmall.people;

public abstract class Staff <T> extends Person{
    private T itemType;

    public Staff(String firstName, String lastName, Integer age, T itemType) {
        super(firstName, lastName, age);
        this.itemType = itemType;
    }


    public String greeting(){
        String output = String.format("Hello I sell items of type %s", itemType);
        return output;
    }

}
