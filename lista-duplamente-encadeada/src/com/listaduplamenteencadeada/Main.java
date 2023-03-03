package com.listaduplamenteencadeada;

public class Main {
    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();

        //isEmpty - Método para conferir se a lista está vezia
        System.out.println(minhaLista.isEmpty());

        minhaLista.addFinal("c1");
        minhaLista.addFinal("c2");
        minhaLista.addFinal("c3");
        minhaLista.addFinal("c4");
        minhaLista.addFinal("c5");
        minhaLista.addFinal("c6");
        minhaLista.addFinal("c7");

        System.out.println(minhaLista);

        //remove - removendo da elemento lista no respectivo indice.
        minhaLista.remove(3);
        System.out.println(minhaLista);

        //add - adicionando na lista no respectivo indice.
        minhaLista.add(3, "00");

        //add - adicionando na lista - no final.
        minhaLista.addFinal("008");
        System.out.println(minhaLista);
        
        //get - mostrando elemento no respectivo indice:
        System.out.println(minhaLista.get(3));

        //size - mostrando tamanho da lista;
        System.out.println(minhaLista.size());

        //addComeco - adicionando na parte da frente da lista.
        minhaLista.addComeco("001");
        System.out.println(minhaLista);
        System.out.println(minhaLista.isEmpty());
        
    }
    
}
