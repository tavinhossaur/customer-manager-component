package com.ifsp.tavinho.customer_manager_component.internal;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerManagerTest {
    private CustomerManager customerManager;

    @BeforeEach
    void setUp() {
        customerManager = new CustomerManager();
    }

    @Test
    void testAddCustomer() {
        String result = customerManager.addCustomer("tavinho");
        assertEquals("tavinho", result);
    }

    @Test
    void testListCustomers() {
        customerManager.addCustomer("guilherme");
        customerManager.addCustomer("luan");
        List<String> customers = customerManager.listCustomers();
        assertTrue(customers.contains("guilherme"));
        assertTrue(customers.contains("luan"));
        assertEquals(2, customers.size());
    }

    @Test
    void testCountCustomers() {
        assertEquals(0, customerManager.countCustomers());
        customerManager.addCustomer("yuri");
        assertEquals(1, customerManager.countCustomers());
    }
    
} 