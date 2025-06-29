package com.ifsp.tavinho.customer_manager_component.provided.boilerplate;

import java.util.ArrayList;
import java.util.List;

public abstract class ComponentInterface {

    protected String id;
    protected List<InterfacePort> ports;

    public ComponentInterface() {
        this.ports = new ArrayList<>();
    }

    public abstract void initialize();
    
    public String getId() {
        return this.id;
    }

    public InterfacePort getPort(String id) {
        return this.ports.stream().filter(port -> port.id.equals(id)).findFirst().get();
    }

    public void connect(InterfacePort externalPort, String portId) {
        InterfacePort selectedPort = this.getPort(portId);
        selectedPort.connect(externalPort);
    }

    public void disconnect(String portId) {
        InterfacePort selectedPort = (InterfacePort) this.getPort(portId);
        selectedPort.disconnect();
    }

    public void connect(InterfacePort externalPort) { }

    public void connectNonComponent(Object externalReference, String portId) { }

    public void disconnect(InterfacePort externalPort, String portId) { }

} 