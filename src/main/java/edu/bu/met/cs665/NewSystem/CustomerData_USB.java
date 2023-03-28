package edu.bu.met.cs665.NewSystem;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: CustomerData_USB.java
 * @Date: 2023/03/26/17:42
 * @Description: Legacy system
 */
public interface CustomerData_USB {
    String printCustomer(int customerId);

    Customer getCustomer_USB(int customerId);
}
