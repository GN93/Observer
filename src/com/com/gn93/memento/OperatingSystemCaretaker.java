package com.gn93.memento;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {

    private List<OperatingSystemMemento> operatingSystemMementoList = new ArrayList<>();

    public void addMemento(OperatingSystemMemento operatingSystemMemento){
        operatingSystemMementoList.add(operatingSystemMemento);
    }

    public OperatingSystemMemento getMemento(int index){
        return operatingSystemMementoList.get(index);
    }


}
