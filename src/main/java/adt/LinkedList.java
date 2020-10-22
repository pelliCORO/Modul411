package adt;

public class LinkedList<T> implements DoubyLinkedList<T>{

    private Node<T> head;
    private Node<T> tail;


    public LinkedList(){
        this.head = new Node<>();
        this.tail = new Node<>();
        head.setRight(tail);
        tail.setLeft(head);
    }


    @Override
    public boolean isEmpty() {
        return head.getRight() == tail;
    }

    @Override
    public void addLast(T payload) {
        Node<T> node = new Node<>(payload);
        node.setRight(tail);
        node.setLeft(tail.getLeft());
        tail.setLeft(node);
    }

    public void addSorted(T payload){

    }

    public Node<T> getFirst(){
        return (isEmpty()) ? null : head.getRight();
    }

    public Node<T> getLast(){
        return (isEmpty()) ? null : tail.getLeft();
    }

    public int getSize(){
        int size = 0;
        if(!isEmpty()) {
            Node<T> node = head.getRight();

            while (node.getRight() != tail) {
                size++;
                node = node.getRight();
            }

        }
        return size;
    }
}
