package com.equalshashcode;

import java.util.ArrayList;
import java.util.List;
/**
* Documentação da interface List:
* <a href="https://docs.oracle.com/javase/7/docs/api/java/util/List.html">Doc Java List</a>
*/ 
public class Main {

    public static void main(String[] args){
        
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Honda"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Chevrolet"));

        //contais - ver se determinado elemente existe na lista.
        System.out.println(listCarros.contains(new Carro("Ford")));

        //get - Pegar elemento do index desejado
        System.out.println("---\nget: " + listCarros.get(2)); 
        
        //set - setar elemento em index desejado, (mudando Fiat por Peugeot)
        System.out.println("---\nset: " + listCarros.set(2, new Carro ("Peugeot")));
        System.out.println(listCarros);
        
        //size
        System.out.println("---\nsize: " + listCarros.size()); 
        
        //indexOf - quando é zero é porque existe o elemento indicado na lista, -1 quando não existe.
        System.out.println("---\n" + listCarros. indexOf(new Carro("Ford")));

        System.out.println("---\n" + listCarros);
        
        //subList "Retorna uma visão da parte desta lista entre um e outro index especificado;"
        System.out.println("---\n" + listCarros.subList(1, 4));

        //etc...//
    }
}
