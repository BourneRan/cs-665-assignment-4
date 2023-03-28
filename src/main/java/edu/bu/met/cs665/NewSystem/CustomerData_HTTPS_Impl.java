package edu.bu.met.cs665.NewSystem;
import java.util.HashMap;
import java.util.Map;
/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: CustomerData_HTTPS_Impl.java
 * @Date: 2023/03/26/18:36
 * @Description: Implementing the new system
 */
public class CustomerData_HTTPS_Impl implements CustomerData_HTTPS{
    Map<Integer, Customer> data;

    public CustomerData_HTTPS_Impl(Map<Integer, Customer> data){
        this.data = data;
    }
    @Override
    public String printCustomer(int customerId) {
        return "Customer ID: " + customerId + " " + "Name: " + data.get(customerId).getName();
    }

    @Override
    public Customer getCustomer_HTTPS(int customerId) {
        return data.get(customerId);
    }
}
