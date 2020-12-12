package com.og;

import java.util.Comparator;

public class ConveyorComparator  implements Comparator<Detail> {
    @Override
    public int compare(Detail o1, Detail o2) {
        return o1.compareTo(o2);
    }
}
