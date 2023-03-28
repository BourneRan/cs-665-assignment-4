package edu.bu.met.cs665;

import edu.bu.met.cs665.NewSystem.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runners.Parameterized;

/**
 * @Author: Zhuoran Xu
 * Created with IntelliJ IDEA.
 * Course: CS-665 Software Designs & Patterns
 * File name: TestUSB_to_HTTPS.java
 * @Date: 2023/03/26/18:49
 * @Description: Junit Test
 */
public class TestUSB_to_HTTPS {

    static CustomerData_USB legacySystem;

    static CustomerData_HTTPS newSystem;

    static CustomerData_HTTPS adapter;



    @BeforeClass
    public static void setup(){
        Map<Integer, Customer> data = new HashMap<>();

        data.put(1,new Customer(1, "Bob"));

        data.put(2, new Customer(2, "Alice"));

        legacySystem = new CustomerData_USB_Impl(data);

        newSystem = new CustomerData_HTTPS_Impl(data);

        adapter = new CustomerData_USB_to_HTTPS_Adapter(legacySystem);
    }

    @Test
    public void testAdapter_Get() {
        Customer customer = adapter.getCustomer_HTTPS(1);
        assertNotNull(customer);
        assertEquals(1, customer.getId());
        assertEquals("Bob", customer.getName());


        Customer customer1 = adapter.getCustomer_HTTPS(2);
        assertNotNull(customer1);
        assertEquals(2,customer1.getId());
        assertEquals("Alice", customer1.getName());
    }
    @Test
    public void testAdapter_Print() {


        System.out.println(adapter.printCustomer(1));

        assertEquals(adapter.printCustomer(1), legacySystem.printCustomer(1));
        assertEquals(adapter.printCustomer(1), newSystem.printCustomer(1));
        adapter.printCustomer(1);
        legacySystem.printCustomer(1);
        newSystem.printCustomer(1);


        System.out.println("\n");

        System.out.println(adapter.printCustomer(2));

        assertEquals(adapter.printCustomer(2), legacySystem.printCustomer(2));
        assertEquals(adapter.printCustomer(2), newSystem.printCustomer(2));
        adapter.printCustomer(2);
        legacySystem.printCustomer(2);
        newSystem.printCustomer(2);

    }

}
