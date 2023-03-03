package com.listacircular;
public class Main {
    public static void main(String[] args) throws Exception {

        ListaCircular<String> listaCircular = new ListaCircular<>(); 

        //isEmpty
        System.out.println("isEmpty? " + listaCircular.isEmpty());
        System.out.println("---\n" + listaCircular);

        //add
        listaCircular.add("00");
        listaCircular.add("01");
        listaCircular.add("02");
        listaCircular.add("03");
        System.out.println("---\n" + listaCircular);

        //size
        System.out.println("---\nsize: " + listaCircular.size());
       
        //remove
        listaCircular.remove(0);
        System.out.println("---\n" + listaCircular);
        
        //add
        listaCircular.add("04");
        System.out.println("---\n" + listaCircular);

     /* get -- mesmo indo até o índice 3 -- colocando o índice 4 ou maior, ela mostra
        o próximo índice de maneira CIRCULAR, o próximo número maior que o número total de
        índice da lista volta para o primeiro índice, como um ciclo. */
        System.out.println("---\nget: " + listaCircular.get(4));

        for(int i = 0; i < 12; i++)
            System.out.print(listaCircular.get(i) + " | ");
    }
}
