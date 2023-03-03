package com.equalshashcode;

import java.util.Stack;

public class Main {

    public static void main(String[] args){
        
        Stack<Carro> stackCarros = new Stack<>();
        
        //empty - ver se a lista está vazia
        System.out.println(stackCarros.empty());

        //push - adicionar elemento ao topo da stack(pilha)
        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);

        //pop - remover carro do topo da stack(pilha);
        System.out.println(stackCarros.pop()); 
        System.out.println(stackCarros); 
        
        //peek - ver o item do topo da lista sem removê-lo;
        System.out.println(stackCarros.peek()); 
        
        //empty
        System.out.println(stackCarros.empty()); 
    }
}
