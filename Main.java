package com.og;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();
        System.out.println(
                factory.addToOutputConveyor(factory.manufacture(factory.addDetailsToManufactureConveyor())));


    }
}
