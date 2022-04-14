package com.codedifferently.genericmall.store;

import com.codedifferently.genericmall.items.Electronic;
import com.codedifferently.genericmall.items.Shoe;
import com.codedifferently.genericmall.people.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StoreTest {

    @Test
    public void hireTest01(){
        Employee<Shoe> employee = new Employee<>("Joe", "Jackson", 38, new Shoe());
        Store<Employee<Shoe>, Shoe> store = new Store<>();
        store.hireEmployee(employee);
    }

    @Test
    public void hireTest02(){
        Employee<Electronic> employee = new Employee<>("Joe", "Jackson", 38, new Electronic());
        Store<Employee<Electronic>, Shoe> store = new Store<>();
        store.hireEmployee(employee);
    }

    @Test
    public void sellTest01() throws Exception {
        Store<Employee<Electronic>, Shoe> store = new Store<>();
        store.addToInventory(new Shoe());
        String expected = "Shoes";
        String actual = store.sell().toString();
        Assertions.assertEquals(expected, actual);
    }



}
