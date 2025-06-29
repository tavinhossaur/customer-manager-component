package com.ifsp.tavinho.customer_manager_component.provided;

import java.util.List;

import com.ifsp.tavinho.customer_manager_component.internal.CustomerManager;
import com.ifsp.tavinho.customer_manager_component.provided.customer.CustomerManagerInterfacePort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerManagerInterfacePortTest {
    
    private CustomerManagerInterfacePort port;
    private CustomerManager manager;

    @BeforeEach
    void setUp() {
        manager = new CustomerManager();
        port = new CustomerManagerInterfacePort("port.customer");
        port.setCustomerManagerReference(manager);
    }

    @Test
    void testAddCustomerViaPort() {
        String result = port.addCustomer("tavinho");
        assertEquals("tavinho", result);
    }

    @Test
    void testListCustomersViaPort() {
        port.addCustomer("guilherme");
        port.addCustomer("luan");
        List<String> customers = port.listCustomers();
        assertTrue(customers.contains("guilherme"));
        assertTrue(customers.contains("luan"));
        assertEquals(2, customers.size());
    }

    @Test
    void testCountCustomersViaPort() {
        assertEquals(0, port.countCustomers());
        port.addCustomer("yuri");
        assertEquals(1, port.countCustomers());
    }
} 