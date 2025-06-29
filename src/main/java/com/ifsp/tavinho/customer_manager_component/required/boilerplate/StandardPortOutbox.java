package com.ifsp.tavinho.customer_manager_component.required.boilerplate;

import com.ifsp.tavinho.customer_manager_component.provided.boilerplate.InterfacePort;

public abstract class StandardPortOutbox extends PortOutbox {

    protected InterfacePort externalPort;

    public void connect(InterfacePort externalPort){
        this.externalPort = externalPort;
    }
    
    public void disconnect(){
        this.externalPort = null;
    }
} 