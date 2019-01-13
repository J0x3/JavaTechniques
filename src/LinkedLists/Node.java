package LinkedLists;

class Node<E> {
    private E data;
    private Node<E> next, prev;

    public Node(E data, Node<E> next, Node<E> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public E getData() { return data; }
    public Node<E> getNext() { return next; }
    public Node<E> getPrev() { return prev; }
    public void setNext(Node<E> newNext) { next = newNext; }
    public void setPrev(Node<E> newPrev) { prev = newPrev; }
    public void setData(E element) { data = element; }
}