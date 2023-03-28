package edu.bu.met.cs665.NewSystem;
import java.util.HashMap;
import java.util.Map;
/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: CustomerData_USB_Impl.java
 * @Date: 2023/03/26/18:27
 * @Description: Implementing the legacy system
 */
public class CustomerData_USB_Impl implements CustomerData_USB{

    Map<Integer, Customer> data;

    public CustomerData_USB_Impl(Map<Integer, Customer> data){
        this.data = data;
    }

    @Override
    public String printCustomer(int customerId) {
        return "Customer ID: " + customerId + " " + "Name: " + data.get(customerId).getName();
    }

    @Override
    public Customer getCustomer_USB(int customerId) {
        return data.get(customerId);
    }
}
