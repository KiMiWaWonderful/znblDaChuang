package com.company.shuzu;

public class Array <E>{

    private E[] data;
    private int size;
    //private int data;

     public Array(int[] data){
        this(10);
     }

     public Array(int capacity){
         data = (E[])new Object[capacity];
         size = 0;
     }

    public Array() {

    }

    public int getSize(){
         return size;
     }

     public int getCapacity(){
         return data.length;
     }

     public boolean isEmpty(){
         return size==0;
     }

     //在数组末尾添加新元素
     public void  addLast(E e) throws Exception {
         add(size,e);
     }

     //在数组开头添加元素
     public void addFirst(E e) throws Exception {
         add(0,e);
     }

     //在第index个位置插入一个新元素e
    public void add(int index,E e) throws Exception {
//        if(size==data.length){
//            throw new Exception("the array is full");
//        }
        if(index<0||index>size){
            throw new Exception("the index is illegal");
        }
        if (size==data.length){
            resize(2*data.length);
        }
        for (int i=size-1;i>=index;i--){
            data[i+1]=data[i];
        }
        data[index] = e;
        size++;
    }

    //取最后一个元素
    public E getLast() throws Exception {
         return get(size - 1);
    }

    //取第一个元素
    public E getFirst() throws Exception {
         return get(0);
    }

    public String toString(){
         StringBuilder res = new StringBuilder();
         res.append(String.format("Array:size= %d ,capacity = %d\n",size,data.length));
         res.append("[");
         for (int i = 0;i<size;i++){
             res.append(data[i]);
             if(i != size -1){
                 res.append(",");
             }

         }
        res.append("]");
        return res.toString();
    }

    //获取index索引位置的元素
    public E get(int index) throws Exception {
        if(index<0||index>size){
            throw new Exception("the index is illegal");
        }
        return data[index];
    }

    //修改index索引位置的元素为e
    void set(int index,E e) throws Exception {
        if(index<0||index>size){
            throw new Exception("the index is illegal");
        }
        data[index]=e;
    }

    //查找数组中是否有元素e
    public boolean contains(E e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //查找数组中是否有元素e及所在的索引
    public int find(E e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }

    //删除元素，并返回删除的元素
    public E remove(int index) throws Exception {
        if(index<0||index>size){
            throw new Exception("the index is illegal");
        }
        E ret = data[index];
        for(int i=index+1;i<size;i++){
            data[i-1]=data[i];
        }
        size--;
        data[size]=null;
        if(size==data.length/4 && data.length/2 != 0){
            resize(data.length/2);
        }
        return ret;

    }

    //从数组中删除第一个元素，返回删除的元素
    public E removeFirst() throws Exception {
        return remove(0);
    }

    //从数组中删除最后一个元素，返回删除的元素
    public E removeLast() throws Exception {
        return remove(size -1);
    }

    //从数组中删除元素e
    public void removeElement(E e) throws Exception {
        int index = find(e);
        if(index != -1){
            remove(index);
        }
    }

    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for (int i=0;i<size;i++){
            newData[i]=data[i];
        }
        data = newData;
    }

}
