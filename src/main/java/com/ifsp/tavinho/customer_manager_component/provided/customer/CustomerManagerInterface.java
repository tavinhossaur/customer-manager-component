package com.ifsp.tavinho.customer_manager_component.provided.customer;

import com.ifsp.tavinho.customer_manager_component.internal.CustomerManager;
import com.ifsp.tavinho.customer_manager_component.provided.boilerplate.ComponentInterface;

public class CustomerManagerInterface extends ComponentInterface {

    protected CustomerManager customerManager;

    public CustomerManagerInterface() {
        this.initialize();
    }

    @Override
    public void initialize() {
        this.id = "interface.customer";

        CustomerManagerInterfacePort customerPort = new CustomerManagerInterfacePort("port.customer");
        this.ports.add(customerPort);

        CustomerManager customerManager = new CustomerManager();
        customerPort.setCustomerManagerReference(customerManager);
    }
    
} 