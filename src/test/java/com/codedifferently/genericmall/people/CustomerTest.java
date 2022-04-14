package com.codedifferently.genericmall.people;

import com.codedifferently.genericmall.items.Shoe;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerTest {
    @Test
    public void greetingTest01(){
        Customer<Shoe> customer = new Customer("Julia", "Roberts", 30, new Shoe());
        String expected = "Yes, I am here to purchase a Shoes";
        String actual =customer.greeting();
        Assertions.assertEquals(expected, actual);
    }
}
