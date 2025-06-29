package com.ifsp.tavinho.customer_manager_component.provided.customer;

import java.util.List;

import com.ifsp.tavinho.customer_manager_component.internal.CustomerManager;

import com.ifsp.tavinho.beyond_boilerplate.provided.InterfacePort;

public class CustomerManagerInterfacePort extends InterfacePort implements ProvidedCustomerManagerInterface {

    private CustomerManager manager;

    public CustomerManagerInterfacePort(String portId) {
        this.id = portId;
        this.manager = new CustomerManager();
    }

    public void setCustomerManagerReference(CustomerManager manager) {
        this.manager = manager;
    }

    @Override
    public void initialize() { } // There are no outbox ports.

    @Override
    public String addCustomer(String name) {
        return this.manager.addCustomer(name);
    }

    @Override
    public List<String> listCustomers() {
        return this.manager.listCustomers();
    }

    @Override
    public int countCustomers() {
        return this.manager.countCustomers();
    }

} 