package com.gn93.visitor;

import com.gn93.element.Animal;
import com.gn93.element.Person;
import com.gn93.element.Shipment;

public interface TransportVisitor {

    void visit (Animal animal);
    void visit (Person person);
    void visit (Shipment shipment);

}
