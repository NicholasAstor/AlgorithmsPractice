package com.example.Vector;

import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Vetor {

    private int[] arr;
    private int size;
    
    /*Construtor sem parâmetros, inicia um vetor de tamanho 10 
    sem elementos por isso size começa zerado*/
    public Vetor(){
        this.size = 0;
        this.arr = new int[10]; 
    }

    /*Construtor com o parâmetro de tamanho do vetor a ser criado
     *também inicia com size zerado por não tem nenhum elemento
     dentro do vetor ainda
     */
    public Vetor(int n){
        this.size = 0;
        this.arr = new int[n];
    }

    /*Método criado para termos um vetor com redimensionamento
     *automático. Aumenta em dobro o tamanho do nosso vetor
     */
    private void resize(){
        int[] newArr = new int[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;        
    }

    /*Retorna a quantidade de elementos que temos atualmente dentro
     *do nosso vetor
     */
    public int size(){
        return size;
    }

    /*Retorna a capacidade que o vetor possui atualmente ela pode sim
     * aumentar devido ao método resize()
     */
    public int capacity(){
        return arr.length;
    }

    /*Retorna true caso nosso vetor não tenha elementos */
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    /*Retorna o conteúdo de determinado index(parâmetro) */
    public int at(int index){
        if(index>=size || index<0){
            throw new ArrayIndexOutOfBoundsException();
        }

        return arr[index];
    }

    /*Nos permite colocar elementos sempre ao final do vetor  */
    public void push(int n){
        if(size == arr.length){
            resize();
        }

        arr[size++] = n;
    }

    /*Método criado para conseguir colocar algum n(parâmetro) em um
     * index(parâmetro) específico
     */
    public void insert(int index, int n){
        if(index>=size || index<0){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(size == arr.length){
            resize();
        }

        System.arraycopy(arr, index, arr, index + 1, size - index);
        arr[index] = n;
        size++;
    }
    
    /*Retorna o último elemento do vetor e retira o mesmo */
    public int pop(){
        if(size==0){
            throw new ArrayIndexOutOfBoundsException("O vetor está vazio.");
        }

        /*int n = arr[size-1];
        int[] tempArr = new int[arr.length];
        System.arraycopy(arr, 0, tempArr, 0, size - 1);
        arr = tempArr;*/


        return arr[--size];
    }

    /*Remove o elemento de determinado index(parâmetro) dentro
     * do Vetor
     */
    public void delete(int index){
        if(index>=size || index<0){
            throw new ArrayIndexOutOfBoundsException();
        }

        System.arraycopy(arr, index + 1, arr, index, (size-1) - index);
        size--;
    }

    /*Remove um determinado item dentro do Vetor, funciona mesmo
     * se o item tiver mais de uma ocorrência 
     */
    public void remove(int item){
        for(int i = 0; i<size; i++){
            if(arr[i]==item){
                delete(i);
                i--;
            }
        }
    }

    /*Retorna o valor do index onde o item(parâmetro) está, se não tiver nenhum item
     * retorna -1
     */
    public int find(int item){
        for(int i=0; i<size; i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }


}
