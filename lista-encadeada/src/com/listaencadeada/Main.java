package com.listaencadeada;

public class Main {

    public static void main(String[] args) {
        
        ListaEncadeada<String> myLinkedList = new ListaEncadeada<>();

        //usando método add para adicionar conteúdo na lista...
        myLinkedList.add("exemplo 1");
        myLinkedList.add("exemplo 2");
        myLinkedList.add("exemplo 3");
        myLinkedList.add("exemplo 4");

        //Usando método get para conferir conteudos da lista...
        System.out.println("GET: " + myLinkedList.get(0));
        System.out.println("GET: " + myLinkedList.get(1));
        System.out.println("GET: " + myLinkedList.get(2));
        System.out.println("GET: " + myLinkedList.get(3));

        System.out.println("\nLIST: " + myLinkedList.toString());

        //usando método size para conferir o tamanho da lista...
        System.out.println("\nSIZE: " + myLinkedList.size());

        //usando método remove para remover...
        System.out.println("\nREMOVED: " + myLinkedList.remove(1));

        System.out.println("\nLIST: " + myLinkedList.toString());
        
        System.out.println("\nSIZE: " + myLinkedList.size());
    }
    
}
