package edu.bu.met.cs665.NewSystem;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: CustomerData_HTTPS.java
 * @Date: 2023/03/26/17:45
 * @Description: New system
 */
public interface CustomerData_HTTPS {
    String printCustomer(int customerId);

    Customer getCustomer_HTTPS(int customerId);
}
