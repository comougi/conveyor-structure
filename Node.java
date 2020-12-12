package com.og;

public class Node<T> {
    private Node<Detail> previous;
    private Node<Detail> next;
    private Detail element;

    public Node(Detail element) {
        this.element = element;
    }

    public Node<Detail> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<Detail> previous) {
        this.previous = previous;
    }

    public Node<Detail> getNext() {
        return next;
    }

    public void setNext(Node<Detail> next) {
        this.next = next;
    }

    public Detail getElement() {
        return element;
    }

    public void setElement(Detail element) {
        this.element = element;
    }
}
