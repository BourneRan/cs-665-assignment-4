package edu.bu.met.cs665.NewSystem;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: null.java
 * @Date: 2023/03/26/18:41
 * @Description: Define an adapter to transform USB TO HTTPS.
 */
public class CustomerData_USB_to_HTTPS_Adapter implements CustomerData_HTTPS{

    CustomerData_USB legacySystem;

    public CustomerData_USB_to_HTTPS_Adapter(CustomerData_USB legacySystem){
        this.legacySystem = legacySystem;
    }

    @Override
    public String printCustomer(int customerId) {
        return legacySystem.printCustomer(customerId);
    }

    @Override
    public Customer getCustomer_HTTPS(int customerId) {
        return legacySystem.getCustomer_USB(customerId);
    }
}
