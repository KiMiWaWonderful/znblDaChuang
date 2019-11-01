package com.company.stack;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e) throws Exception;
    E pop() throws Exception;
    E peek() throws Exception;
}
