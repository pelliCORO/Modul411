package adt;

public interface DoubyLinkedList<T> {

     boolean isEmpty();

     Node<T> getFirst();

     Node<T> getLast();

     int getSize();

     void addLast(T Object);

}
