package com.am.test;

import org.junit.Test;
import static org.junit.Assert.*;

import com.am.code.Customer;

public class TestCustomer {

    @Test
    public void testGetCustomerName() {
        Customer customer1 = new Customer();
        customer1.setFirstName("Aaron");
        customer1.setLastName("Myatt");
        assertEquals("Aaron Myatt", customer1.getCustomerName());

        Customer customer2 = new Customer();
        customer2.setFirstName(null);
        customer2.setLastName(null);
        assertEquals("N/A N/A", customer2.getCustomerName());
    }
}
