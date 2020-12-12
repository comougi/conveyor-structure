package com.og;

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
            details.getNode(i).getElement().setBroken(i % 3 == 0);
        }
    }

    public void addToOutputConveyor(DoublyLinkedList<Detail> details) {
        for (MyIterator it = details.getIterator(details); it.hasNext(); ) {

            Detail detail = it.next();
            if (detail.isBroken()) {
                it.remove();
            } else {
                System.out.println(detail);
            }
        }
    }
}
