package com.og;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Detail detail1 = new Detail("motor", 10);
        Detail detail2 = new Detail("wheel", 2);
        Detail detail3 = new Detail("gear", 5);
        Detail detail4 = new Detail("switcher", 1);
        Detail detail5 = new Detail("stick", 3);
        Detail detail6 = new Detail("bumper", 6);
        Detail detail7 = new Detail("fender", 3);
        Factory factory = new Factory("Tesla motors", 10);

        factory.addDetailToQueue(detail1);
        factory.checkAfterManufacture(detail1);

        factory.addDetailToQueue(detail2);
        factory.checkAfterManufacture(detail2);

        factory.addDetailToQueue(detail3);
        factory.checkAfterManufacture(detail3);

        factory.addDetailToQueue(detail4);
        factory.checkAfterManufacture(detail4);

        factory.addDetailToQueue(detail5);
        factory.checkAfterManufacture(detail5);

        factory.addDetailToQueue(detail6);
        factory.checkAfterManufacture(detail6);

        factory.addDetailToQueue(detail7);
        factory.checkAfterManufacture(detail7);

        System.out.println(factory.details);

    }
}
