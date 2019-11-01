package com.company.stack;

//import java.util.Stack;

import com.company.shuzu.Array;

//动态数组实现栈
public class ArrayStack<E> implements Stack<E>{

    Array<E> array;

    public ArrayStack(int capacity){
        array = new Array<E>(capacity);
    }

    public ArrayStack(){
        array = new Array<E>();
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
    public void push(E e) throws Exception {
         array.addLast(e);
    }

    @Override
    public E pop() throws Exception {
        return array.removeLast();
    }

    @Override
    public E peek() throws Exception {
        return array.getLast();
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack:");
        res.append('[');
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
        res.append("]top");
        return res.toString();
    }
}
