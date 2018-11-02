package com.gn93.element;

import com.gn93.visitor.TransportVisitor;

public class Person implements Transportable{

    private String fristName;
    private String lastName;
    private boolean isRegularCustomer;

    public Person(String fristName, String lastName, boolean isRegularCustomer) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.isRegularCustomer = isRegularCustomer;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isRegularCustomer() {
        return isRegularCustomer;
    }

    @Override
    public void accept(TransportVisitor transportVisitor) {
        transportVisitor.visit(this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
