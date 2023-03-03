package com.equalshashcode;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args){
        
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Honda"));
        
        System.out.println(queueCarros);
        
        //remove
        System.out.println(queueCarros.remove(new Carro ("Ford")));
        System.out.println(queueCarros);
        
        //remove - O método remove sem especificar o elemento remove o do início da fila.
        //[00, 001, 002, 003] <-- removeria o 001 nesse caso.
        System.out.println(queueCarros.remove());
        System.out.println(queueCarros);
        
        //add - Mostra true ou fase caso consiga ou não adicionar.
        System.out.println(queueCarros.add(new Carro("Peugeot")));
        System.out.println(queueCarros);
        
        //Ao usar uma fila(queue) com capacidade restrita, geralmente é preferível 
        //adicionar esse método(offer), que pode falhar ao inserir um elemento apenas lançando uma exceção.
        System.out.println(queueCarros.offer(new Carro("Peugeot")));
        System.out.println(queueCarros);
        
        //peek - pega o primeiro da fila sem removê-lo;
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);
        
        //poll - pega remove o primeiro item dfa fila;
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);
        
        //size - saber o tamanho/quantidade da fila;
        System.out.println(queueCarros.size());
        
        //add - sempre no final da fila...
        queueCarros.add(new Carro("Fiat"));
        System.out.println(queueCarros);
    }
}
