package com.codedifferently.genericmall.people;

import com.codedifferently.genericmall.items.Electronic;
import com.codedifferently.genericmall.items.FoodCourt;
import com.codedifferently.genericmall.items.Shoe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    @Test
    public void constructorTest01(){
        Employee<Electronic> employee = new Employee("Bill", "Jackson", 38, new Electronic());

        String expected = String.format("Hi my name is %s and I am %d years of age.", "Bill Jackson", 38);
        String actual = employee.toString();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void greetingTest01(){
        Employee<Electronic> employee = new Employee("Bill", "Jackson", 38, new Electronic());

        String expected = String.format("Hello I sell items of type %s", "Electronics");
        String actual = employee.greeting();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void greetingTest02(){
        Employee<Shoe> employee = new Employee("Bill", "Jackson", 38, new Shoe());

        String expected = String.format("Hello I sell items of type %s", "Shoes");
        String actual = employee.greeting();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void greetingTest03(){
        Employee<FoodCourt> employee = new Employee("Bill", "Jackson", 38, new FoodCourt());

        String expected = String.format("Hello I sell items of type %s", "Food");
        String actual = employee.greeting();
        Assertions.assertEquals(expected, actual);
    }
}
