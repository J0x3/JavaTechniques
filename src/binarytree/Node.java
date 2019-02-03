package binarytree;

public class Node<E> {
    E data;
    Node left;
    Node right;

    Node(E data) {
        this.data = data;
        right = null;
        left = null;
    }
}
