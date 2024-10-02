package com.example;
/*Vou utilizar a classe Main para testar o funcionamento do algoritmo que estou criando
 *assim consigo de forma mais eficaz determinar se necessita de algum ajuste.
 */

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        vetor.push(1);
        vetor.push(2);
        vetor.push(3);
        vetor.push(4);
        vetor.push(3);
        vetor.push(3);
        vetor.push(3);
        //System.out.println(vetor.isEmpty());
        //System.out.println(vetor.size());
        //System.out.println(vetor.capacity());
        //System.out.println(vetor.at(0));
        //System.out.println(vetor.at(0));
        //System.out.println(vetor.at(1));
        //System.out.println(vetor.at(2));
        //System.out.println(vetor.at(3));
        //vetor.delete(4);
        //vetor.delete(6);
        //vetor.remove(3);
        vetor.insert(6,6);
        vetor.insert(2,22);
        vetor.insert(1,61);
        vetor.pop();
        vetor.pop();
        vetor.pop();
        vetor.pop();
        vetor.pop();
        vetor.pop();
        for(int i = 0; i<vetor.size(); i++){
            System.out.println(vetor.at(i));
        }

    }
}