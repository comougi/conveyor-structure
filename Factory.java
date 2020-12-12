package com.og;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;

public class Factory {

    public void addDetailsToManufactureConveyor(DoublyLinkedList<Detail> details) {

        details.addElement(new Detail("motor", 10));
        details.addElement(new Detail("wheel", 2));
        details.addElement(new Detail("gear", 5));
        details.addElement(new Detail("switcher", 1));
        details.addElement(new Detail("stick", 3));
        details.addElement(new Detail("bumper", 6));
        details.addElement(new Detail("fender", 3));
        details.addElement(new Detail("tube", 2));
        details.addElement(new Detail("butterfly door", 4));

    }

    public void manufacture(DoublyLinkedList<Detail> details) {
        for (int i = 0; i < details.getSize(); i++) {
            details.getElement(i).setBroken(i % 3 == 0);

        }
    }

    public void addToOutputConveyor(DoublyLinkedList<Detail> details) {
        details.sort(new ConveyorComparator()); //??

    }


}
