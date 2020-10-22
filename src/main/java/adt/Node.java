package adt;

public class Node<T> implements Comparable<T> {


    private T payload;
    private Node<T> right;
    private Node<T> left;

    public Node() {
    }

    public Node(T payload) {

        this.payload = payload;
    }


    public T getPayload() {

        return payload;
    }

    public void setPayload(T payload) {

        this.payload = payload;
    }

    public Node<T> getRight() {

        return right;
    }

    public void setRight(Node<T> right) {

        this.right = right;
    }

    public Node<T> getLeft() {

        return left;
    }

    public void setLeft(Node<T> left) {

        this.left = left;
    }

    @Override
    public int compareTo(T o) {

        return 0;
    }
}
