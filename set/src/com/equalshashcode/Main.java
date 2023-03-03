package com.equalshashcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/**
 *<p> {@code Set} --> Lista aleatória;

 *<p> Essa classe (Set/HashSet) não garante a ordem de iteração do conjunto; em particular,
 * não garante que a ordem permaneça constante ao longo do tempo.
 * 
 * @see <a href = "https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/util/HashSet.html">HashSet doc</a>
 */

public class Main {

    public static void main(String[] args){
        
        //HashSet
        Set<Carro> hashCarros = new HashSet<>();

        //add
        hashCarros.add(new Carro("Fiat"));
        hashCarros.add(new Carro("Ford"));
        hashCarros.add(new Carro("Chevrolet"));
        hashCarros.add(new Carro("Honda"));

        
        System.out.println("---\n" + hashCarros);
        
        //containsAll - Retorna verdadeiro se estiver todos os elementos da coleção especificada;
        System.out.println("---\n" + hashCarros.containsAll(hashCarros));

        System.out.println("---\n" + hashCarros.size());

        //clear - remove todos os elementos da "list"...
        hashCarros.clear();
        System.out.println("---\n" + hashCarros);

        //----------------------------------------------------------\\

       /*TreeSet - É necessário a adição do método compareTo na classe do obj;
        *E a implementação de Comparable na classe, exemplo:
        *public class Carro implements Comparable<Carro>
        */
        Set<Carro> treeCarros = new TreeSet<>();

        //add
        treeCarros.add(new Carro("Fiat"));
        treeCarros.add(new Carro("Ford"));
        treeCarros.add(new Carro("Chevrolet"));
        treeCarros.add(new Carro("Honda"));
        System.out.println("---\n" + treeCarros);

        //remove
        treeCarros.remove(new Carro ("Fiat"));
        System.out.println("---\n" + treeCarros);
    }
}
