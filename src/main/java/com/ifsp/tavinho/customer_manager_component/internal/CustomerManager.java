package com.ifsp.tavinho.customer_manager_component.internal;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {

    private List<String> customers = new ArrayList<>();

    public String addCustomer(String name) {
        customers.add(name);
        return customers.stream().filter(c -> c.equalsIgnoreCase(name)).findFirst().orElse(null);
    }

    public List<String> listCustomers() {
        return new ArrayList<>(customers);
    }

    public int countCustomers() {
        return customers.size();
    }

} 