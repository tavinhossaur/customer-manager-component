package com.ifsp.tavinho.customer_manager_component.provided.customer;

import java.util.List;

public interface ProvidedCustomerManagerInterface {
    String addCustomer(String name);
    List<String> listCustomers();
    int countCustomers();
} 