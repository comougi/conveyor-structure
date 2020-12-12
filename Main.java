package com.og;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();
        DoublyLinkedList<Detail> details = new DoublyLinkedList<Detail>();
        factory.addDetailsToManufactureConveyor(details);
        factory.manufacture(details);
        factory.addToOutputConveyor(details);
        System.out.println(details);
    }
}
