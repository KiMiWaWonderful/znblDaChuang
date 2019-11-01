package com.company.queue;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e) throws Exception;
    E dequeue() throws Exception;
    E getFront() throws Exception;
}
