package com.og;

import java.util.ArrayList;

public class Factory {

    public void addDetailsToManufactureConveyor(ArrayList<Detail> details) {

        details.add(new Detail("motor", 10));
        details.add(new Detail("wheel", 2));
        details.add(new Detail("gear", 5));
        details.add(new Detail("switcher", 1));
        details.add(new Detail("stick", 3));
        details.add(new Detail("bumper", 6));
        details.add(new Detail("fender", 3));
        details.add(new Detail("tube", 2));
        details.add(new Detail("butterfly door", 4));

    }

    public void manufacture(ArrayList<Detail> details) {
        for (int i = 0; i < details.size(); i++) {
            if (i % 3 == 0) {
                details.get(i).setBroken(true);
            } else {
                details.get(i).setBroken(false);
            }

        }
    }

    public void addToOutputConveyor(ArrayList<Detail> details) {
        details.sort(new ConveyorComparator());
    }


}
