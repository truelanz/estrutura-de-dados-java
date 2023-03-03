package com.fila;

public class Main {

    public static void main(String[] args) {
        
        //Refatoração Generics <T> Type...
        Queue<String> myQueue = new Queue<>();

        /* myQueue.enqueue(new Node("first"));
        myQueue.enqueue(new Node("second"));
        myQueue.enqueue(new Node("third"));
        myQueue.enqueue(new Node("fourth")); */

        //Refatoração, object...
        /* myQueue.enqueue("first");
        myQueue.enqueue(2);
        myQueue.enqueue(3.0);
        myQueue.enqueue("fourth"); */
        
        myQueue.enqueue("first");
        myQueue.enqueue("second");
        myQueue.enqueue("third");
        myQueue.enqueue("fourth");
        
        
        System.out.println(myQueue);
        //Retirando o primeiro da fila.
        System.out.println(myQueue.dequeue()); 
        //O primeiro da fila agora é o "second"
        System.out.println(myQueue);
        //Adicionando à fila...
        myQueue.enqueue("fith");
        System.out.println(myQueue);
        //Verificando quem é o primeiro da fila...
        System.out.println(myQueue.first());
    }
    
}
