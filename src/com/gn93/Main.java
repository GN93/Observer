package com.gn93;

import com.gn93.element.*;
import com.gn93.visitor.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        TransportVisitor nameTransportVisitor = new NameTransportVisitor();
        TransportVisitor priceTransportVisitor = new PriceTransportVisitor();

        transportableList.forEach(element -> element.accept(nameTransportVisitor));
        transportableList.forEach(element -> element.accept(priceTransportVisitor));

    }
}
