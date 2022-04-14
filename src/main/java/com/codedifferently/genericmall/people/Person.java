package com.codedifferently.genericmall.people;

public abstract class Person {
    private String firstName;
    private String lastName;
    private Integer age;


    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;


    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }



    public String toString(){
        String output = String.format("Hi my name is %s and I am %d years of age.", getFullName(), age);
        return output;
    }
}
