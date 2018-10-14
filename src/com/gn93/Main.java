package com.gn93;

import day.MyDay;
import day.TypeOfTransport;
import day.WeekDay;

public class Main {

    public static void main(String[] args) {

        WeekDay myday = new MyDay();
        myday.dayStartingSequence(TypeOfTransport.CAR);
    }
}
