package com.company.queue;

public class LoopQueue<E> implements Queue<E>{

    private E[] data;
    private int front,tail;
    private int size;

    public LoopQueue(int capacity){
        data = (E[])new Object[capacity+1]; //队列的capacity要浪费一个空间
        front=0;
        tail=0;
        size=0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getCapacity(){
        return data.length-1;
    }

    @Override
    public boolean isEmpty(){
        return front==tail;
    }
    @Override
    public int getSize() {
        return size;
    }


     //进队
    @Override
    public void enqueue(E e) throws Exception {

        if((tail+1)% data.length==front){//判断是否已满
            resize(getCapacity());
        }
        data[tail] = e;
        tail = (tail+1)%data.length;
        size++;

    }

    @Override
    public E dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("data is empty");
        }
        E ret = data[front];
        data[front] = null;
        front = (front+1) % data.length;
        size--;
        if(size==getCapacity()/4 && getCapacity()/2 !=0){
            resize(getCapacity()/2);
        }
        return ret;
    }

    @Override
    public E getFront() throws Exception {
        if(isEmpty()){
            throw new Exception("data is empty");
        }
        return data[front];
    }

    //队列扩容
    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity+1];
        for (int i = 0;i<size;i++){
            newData[i] = data[(i+front)%data.length];//因为是循环队列需要%。。的操作

        }
        data =  newData;
        front=0;
        tail=size;
    }

    @Override
    public String toString(){

        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d , capacity = %d\n", size, getCapacity()));
        res.append("front [");
        for(int i = front ; i != tail ; i = (i + 1) % data.length){
            res.append(data[i]);
            if((i + 1) % data.length != tail)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }



}
