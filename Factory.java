package com.og;

import java.util.Iterator;
import java.util.Random;

public class Factory implements Iterable<Detail> {
    private final String name;
    private final int rating;
    DoublyLinkedList<Detail> details;
    int i=0;

    public Factory(String name, int rating) {
        this.name = name;
        this.rating = rating;
        details=new DoublyLinkedList<Detail>();
    }

    public void addDetailToQueue(Detail detail) {
        detail.setIndex(detail.getIndex()+i);
        details.addElement(detail);
        i++;
        System.out.printf("Деталь %s с размером %d отправлена на производство%n", detail.getTitle(), detail.getSize());
    }

    public void checkAfterManufacture(Detail detail) {
        Random random=new Random();
        detail.setBroken(random.nextBoolean());

        System.out.printf("Деталь %s с размером %d изготовлена. Поломка - %s\n", detail.getTitle(), detail.getSize(), detail.isBroken());
        if(detail.isBroken()){
            details.removeAtIndex(detail.getIndex());
            i--;
        }
    }




    @Override
    public Iterator<Detail> iterator() {
        DoublyLinkedList<Detail> list = details;
        final int[] i = {-1};
        return new Iterator<Detail>() {
            @Override
            public boolean hasNext() {
                return list.getNode(i[0]).getNext() != null;
            }

            @Override
            public Detail next() {
                Detail element = list.getNode(i[0]).getNext().getElement();
                i[0]++;
                return element;
            }
        };
    }


}
