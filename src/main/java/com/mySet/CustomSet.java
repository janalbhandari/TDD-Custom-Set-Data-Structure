package com.mySet;

import java.util.Arrays;

public class CustomSet<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int size = 0;
    private Object set[];

    public boolean isEmpty(){
        return (size()==0);
    }

    public CustomSet(){
        set = new Object[DEFAULT_CAPACITY];
    }

    public void add(E e){
//        System.out.println(size);

        for(int i=0; i<size(); i++){
            if(set[i] == e)
                return;
        }

        set[size++] = e;

        if(size == set.length) {
            newArray();
        }
    }

    public void newArray(){
        int newSize = set.length * 2;
        set = Arrays.copyOf(set, newSize);
    }

    public int size() {
        return size;
    }

    public boolean contains(E e) {
        for(int i=0; i<size(); i++){
            if(set[i] == e)
                return true;
        }
        return false;
    }

    public Object remove(int i) throws IndexOutOfBoundsException{
        if(!isEmpty()){
            int index = i;
            Object element = set[i];
            if(set[i] != null){
                set[i] = null;
            }

            while(index < size()){
                Object temp = set[index];
                set[index] = set[index+1];
                set[index++] = temp;
            }
            size--;

            return element;
        }

        return null;
    }

    public void clear() {
        set =  new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
