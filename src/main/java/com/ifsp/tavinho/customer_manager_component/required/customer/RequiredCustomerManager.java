package com.ifsp.tavinho.customer_manager_component.required.customer;

import java.util.List;

public interface RequiredCustomerManager {
    String addCustomer(String name);
    List<String> listCustomers();
    int countCustomers();
} 