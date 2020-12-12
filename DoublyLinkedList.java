package com.og;

public class DoublyLinkedList<T> {
    private Node<Detail> head;
    private Node<Detail> last;
    private int size;

    public DoublyLinkedList() {
    }

    public MyIterator getIterator(DoublyLinkedList<Detail> details) {
        return new MyIterator(details);
    }

    public void addElement(Detail element) {
        Node<Detail> node = new Node<Detail>(element);
        if (size == 0) {
            head = node;
        } else {
            last.setNext(node);
            node.setPrevious(last);
        }
        last = node;

        size++;
    }


    public Node<Detail> getNode(int index) {
        Node<Detail> current = null;
        if (index >= 0 || index < size) {
            current = head;
            int k = 0;
            while (k < index) {
                current = current.getNext();
                k++;
            }
        }
        return current;
    }

    private Detail getElement(int index) {
        return getNode(index).getElement();
    }


    public void insertBefore(Detail element, int index) {

        Node<Detail> node = null;

        if (index == size) {
            addElement(element);
            return;
        }
        node = new Node<Detail>(element);

        if (index == 0) {
            node.setNext(head);
            head.setPrevious(node);
            head = node;
            size++;
            return;
        }

        Node<Detail> current = getNode(index);

        current.getPrevious().setNext(node);
        node.setPrevious(current.getPrevious());

        node.setNext(current);
        current.setPrevious(node);

        size++;
    }

    public void removeAtIndex(int index) {
        Node<Detail> node = getNode(index);

        if (head == node) {
            if (head.getNext() != null) {
                head.getNext().setPrevious(null);
                head = head.getNext();
            } else {
                head = null;
            }
        } else if (last == node) {
            if (last.getPrevious() != null) {
                last.getPrevious().setNext(null);
                last = last.getPrevious();
            } else {
                last = null;
            }
        } else {
            node.getPrevious().setNext(node.getNext());
            node.getNext().setPrevious(node.getPrevious());
        }
        size--;
    }

    private void setElement(Detail val, int index) {
        getNode(index).setElement(val);
    }

    @Override
    public String toString() {
        Node<Detail> current = head;
        StringBuilder s = new StringBuilder();
        while (current != null) {
            s.append(current.getElement().toString()).append(", ");
            current = current.getNext();
        }

        return String.format("TwoWayList: { count = %d , elements ={ %s }}", size, s.toString());
    }

    public Node<Detail> getHead() {
        return head;
    }

    public Node<Detail> getLast() {
        return last;
    }

    public int getSize() {
        return size;
    }
}
