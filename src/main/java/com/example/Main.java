package com.example;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        vetor.push(1);
        vetor.push(2);
        vetor.push(3);
        vetor.push(4);
        vetor.push(5);
        //System.out.println(vetor.isEmpty());
        //System.out.println(vetor.size());
        //System.out.println(vetor.capacity());
        //System.out.println(vetor.at(0));
        //System.out.println(vetor.at(0));
        //System.out.println(vetor.at(1));
        //System.out.println(vetor.at(2));
        //System.out.println(vetor.at(3));
        vetor.delete(2);
        System.out.println("");
        for(int i = 0; i<vetor.size(); i++){
            System.out.println(vetor.at(i));
        }

    }
}