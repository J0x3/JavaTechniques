package LinkedLists;

public class SingleLinkedList<E> {
    protected Node<E> head;
    protected int size;

    public SingleLinkedList() { size = 0; head = null; }

    public boolean isEmpty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }

    // if head is null, the list becomes unlinked
    // and marked for garbage collection
    public void removeAll() { head = null; size = 0; }

    // add node to front of list
    public void add(E element) {
        Node<E> temp = new Node<E>(element, null, null);

        if (head == null) { head = temp; }
        else {
            temp.setNext(head);
            head = temp;
        }
        size++;
    }

    public void display() {
        if (size == 0) { System.out.println("empty list"); return; }
        if (head.getNext() == null) { System.out.println(head.getData()); return; }

        Node<E> temp = head;
        while (temp != null)
        {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public static void main(String[] args) {
        System.out.println("SingleLinkedList:");
        SingleLinkedList<String> shoppingList = new SingleLinkedList<>();
        shoppingList.add("Apple");
        shoppingList.add("Cherry");
        shoppingList.add("Durian");
        shoppingList.add("Elderberry");
        shoppingList.display();
        shoppingList.removeAll();
        SingleLinkedList<Integer> intList = new SingleLinkedList<>();
        intList.add(21);
        intList.add(13);
        intList.add(8);
        intList.add(5);
        intList.add(3);
        intList.add(2);
        intList.add(1);
        intList.add(1);
        intList.add(0);
        intList.display();
        intList.removeAll();
    }
}

