package com.codedifferently.genericmall.store;


import com.codedifferently.genericmall.items.Dogs;
import com.codedifferently.genericmall.people.Employee;

import java.util.ArrayList;

public class Store <E,T>{
    private ArrayList<E> employees;
    private ArrayList<T> inventory;

    public Store(){
        employees = new ArrayList<>();
        inventory = new ArrayList<>();
    }

    public void hireEmployee(E employee){
        employees.add(employee);
    }

    public void addToInventory(T item){
        inventory.add(item);
    }

    public T sell() throws Exception {
        if(inventory.isEmpty())
            throw new Exception("No more inventory");
        return inventory.remove(0);
    }


    public static void main(String[] args) {
        Store<Employee<Dogs>, Dogs> store = new Store();
        store.addToInventory(new Dogs());
    }

}
