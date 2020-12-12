package com.og;

public class Detail implements Comparable<Detail> {
    private final String title;
    private final int size;
    private final boolean isBroken;

    public Detail(String title, int size, boolean isBroken) {
        this.title = title;
        this.size = size;
        this.isBroken = isBroken;
    }

    @Override
    public String toString() {
        return "Title - " + title +
                ", Size - " + size +
                ", Broken - " + isBroken;
    }

    @Override
    public int compareTo(Detail o) {
        if (this.isBroken && this.size < o.size) return -1;
        if (o.isBroken) return 1;
        if (this.size > o.size) return -1;
        if(!this.isBroken &&this.size<o.size) return -1;
        return 0;
    }
}
