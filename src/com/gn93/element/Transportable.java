package com.gn93.element;

import com.gn93.visitor.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);

}
