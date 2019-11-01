package com.company.queue;

import com.company.shuzu.Array;

public class ArrayQueue<E> implements Queue<E> {

    private Array<E> array;

    public ArrayQueue(int capacity){
        array = new Array<>(capacity);
    }
    public ArrayQueue(){
        array = new Array<>();
    }
    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public void enqueue(E e) throws Exception{
        array.addLast(e);

    }

    @Override
    public E dequeue() throws Exception {
        return array.removeFirst();
    }

    @Override
    public E getFront() throws Exception {
        return array.getFirst();
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue:");
        res.append("head:[");
        for (int i = 0;i<array.getSize();i++){
            try {
                res.append(array.get(i));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if( i != array.getSize()-1){
                res.append(",");
            }
        }
        res.append("]tail");
        return res.toString();
    }
}
