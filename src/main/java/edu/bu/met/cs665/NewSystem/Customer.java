package edu.bu.met.cs665.NewSystem;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: Customer.java
 * @Date: 2023/03/26/18:24
 * @Description: Mock customer data
 */
public class Customer {
    private int id;

    private String name;

    public Customer(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }
}
