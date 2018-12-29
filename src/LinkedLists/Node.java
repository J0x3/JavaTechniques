package LinkedLists;

class Node<E> {
    private E d;
    private Node<E> n, p;

    public Node(E data, Node<E> next, Node<E> prev) {
        d = data;
        n = next;
        p = prev;
    }

    public E getData() { return d; }
    public Node<E> getNext() { return n; }
    public Node<E> getPrev() { return p; }
    public void setNext(Node<E> newNext) { n = newNext; }
    public void setPrev(Node<E> newPrev) { p = newPrev; }
    public void setData(E element) { d = element; }
}