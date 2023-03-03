package com.pilhas;
public class Main {
    public static void main(String[] args) {

        Pilha minhaPilha = new Pilha();

        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));
        
        //pop lendo e removendo útima adição da Pilha.
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);
        
        //push adicionando um valor de Nó na Pilha.
        minhaPilha.push(new No(7));
        
        System.out.println(minhaPilha);
        //top mostrando útimo Nó da Pilha
        System.out.println(minhaPilha.top());

        //isEmpty verificando se a Pilha está vazia.
        System.out.println(minhaPilha.isEmpty());
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha.isEmpty());


        
    
    }
}
