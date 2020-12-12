package com.og;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();
        ArrayList<Detail> details = new ArrayList<>();
        factory.addDetailsToManufactureConveyor(details);
        factory.manufacture(details);
        factory.addToOutputConveyor(details);
        details.sort(new ConveyorComparator());
        System.out.println(details);
    }
}
