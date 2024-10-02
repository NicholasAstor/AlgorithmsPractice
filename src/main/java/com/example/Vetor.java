package com.example;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Vetor {

    private int[] arr;
    private int size;

    public Vetor(){
        this.size = 0;
        this.arr = new int[10]; 
    }

    public Vetor(int n){
        this.size = 0;
        this.arr = new int[n];
    }

    private void resize(){
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;        
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return arr.length;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int at(int index){
        if(index>arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }

        return arr[index];
    }

    public void push(int n){
        if(size == arr.length){
            resize();
        }

        arr[size++] = n;
    }

    public void insert(int index, int n){
        if(index>arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(size == arr.length){
            resize();
        }

        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = n;
        size++;
    }
    
    public int pop(){
        int n = arr[size-1];
        int[] tempArr = new int[arr.length];
        System.arraycopy(arr, 0, tempArr, 0, size - 1);
        arr = tempArr;
        return n;
    }

    public void delete(int index){
        if(index>arr.length){
            throw new ArrayIndexOutOfBoundsException();
        }

        System.arraycopy(arr, index + 1, arr, index, (size-1) - index);
        size--;
    }
}
