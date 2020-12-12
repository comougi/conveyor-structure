package com.og;

import java.util.ArrayList;

public class Factory {
    public ArrayList<Detail> addDetailsToManufactureConveyor() {
        ArrayList<Detail> details = new ArrayList<>();

        details.add(new Detail("motor", 10));
        details.add(new Detail("wheel", 2));
        details.add(new Detail("gear", 5));
        details.add(new Detail("switcher", 1));
        details.add(new Detail("stick", 3));
        details.add(new Detail("bumper", 6));
        details.add(new Detail("fender", 3));
        details.add(new Detail("tube", 2));
        details.add(new Detail("butterfly door", 4));
        return details;
    }

    public ArrayList<Detail> manufacture(ArrayList<Detail> details) {
        ArrayList<Detail> createdDetails = new ArrayList<>();
        for (int i = 0; i < details.size(); i++) {
            details.get(i).setBroken(i % 3 == 0);
            createdDetails.add(details.get(i));
        }
        return createdDetails;
    }

    public ArrayList<Detail> addToOutputConveyor(ArrayList<Detail> details) {
        details.sort(new ConveyorComparator());
        return details;
    }
}
