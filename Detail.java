package com.og;

public class Detail {
    private final String title;
    private final int size;
    private int index;
    private boolean isBroken = false;

    public void setIndex(int index) {
        this.index = index;
    }

    public Detail(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public int getIndex() {
        return index;
    }


    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    @Override
    public String toString() {
        return "Title - " + title +
                ", Size - " + size +
                ", Broken - " + isBroken  + "\n";
    }

}
