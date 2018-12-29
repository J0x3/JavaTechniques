package LinkedLists;

public class DoubleLinkedList<E> extends SingleLinkedList {
    protected Node<E> tail;

    public DoubleLinkedList() { size = 0; head = tail = null; }

    // add node to back of list
    public void addBack(E element) {
        Node<E> temp = new Node<E>(element, null, null);

        if (head == null) { head = temp; tail = head; }
        else {
            temp.setPrev(tail);
            tail.setNext(temp);
            tail = temp;
        }
        size++;
    }

    public static void main(String[] args) {
        System.out.println("Hello World! from DOUBLE");
    }
}
