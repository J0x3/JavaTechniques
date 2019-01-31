package linkedlist;

import exceptions.ListIndexOutOfBoundsException;

public interface ILinkedListADT {
    Node find(int index);

    boolean isEmpty();

    int size();

    void add(int index, Object item);

    void remove(int index) throws ListIndexOutOfBoundsException ;

    Object get(int index) throws ListIndexOutOfBoundsException;

    void removeAll();

    void display();
}
