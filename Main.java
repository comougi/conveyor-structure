package com.og;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Detail> details = new ArrayList<Detail>();
        details.add(new Detail("motor", 10, true));
        details.add(new Detail("wheel", 2, true));
        details.add(new Detail("gear", 5, false));
        details.add(new Detail("switcher", 1, false));



        details.sort(new ConveyorComparator());
        System.out.println(details);
    }
}
