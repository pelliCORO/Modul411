package adt;



public class Ringbuffer<T> implements Queue<T> {

    Object[] queue = new Object[10];
    private int rear = 0;
    private int front = 0;

    @Override
    public boolean isEmpty() {
        return rear == front;
    }

    @Override
    public T getFrontElement() {
        return (T) queue[front-1];
    }

    @Override
    public T getRearElement() {

        return (T) queue[rear];
    }

    @Override
    public void put(T payload) {
        queue[front]=payload;
        front++;
    }


    @Override
    public T remove() {
        return null;
    }
}
