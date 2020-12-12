package com.og;

import java.util.Iterator;

public class MyIterator implements Iterator<Detail> {
    private DoublyLinkedList<Detail> list;
    int i=-1;

    public MyIterator(DoublyLinkedList<Detail> list) {
        this.list = list;
    }


    @Override
    public boolean hasNext() {
        return list.getNode(i).getNext() != null;
    }

    @Override
    public Detail next() {
        Detail element = list.getNode(i).getNext().getElement();
        i++;
        return element;
    }

    @Override
    public void remove() {
    }
}
