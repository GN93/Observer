package com.gn93.element;

import com.gn93.visitor.TransportVisitor;

public class Shipment implements Transportable{

    private String prefix;
    private String serialNumber;
    private boolean isLarge;

    public Shipment(String prefix, String serialNumber, boolean isLarge) {
        this.prefix = prefix;
        this.serialNumber = serialNumber;
        this.isLarge = isLarge;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isLarge() {
        return isLarge;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "prefix='" + prefix + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
