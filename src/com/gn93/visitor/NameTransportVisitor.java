package com.gn93.visitor;

import com.gn93.element.Animal;
import com.gn93.element.Person;
import com.gn93.element.Shipment;

public class NameTransportVisitor implements TransportVisitor {

    @Override
    public void visit(Animal animal) {
        System.out.println(animal);
    }

    @Override
    public void visit(Person person) {
        System.out.println(person);
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println(shipment);
    }
}
