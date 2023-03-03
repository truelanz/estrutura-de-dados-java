package com.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Carro> listaCarro = new ArrayList<>();

        //equals;
        listaCarro.add(new Carro("Ford"));
        listaCarro.add(new Carro("ford"));
        listaCarro.add(new Carro("Chevrolet"));
        listaCarro.add(new Carro("Volkswagen"));

        //método contains
        System.out.println(listaCarro.contains(new Carro("Ford")));
        /* System.out.println(new Carro("Chevrolet").hashCode());
        System.out.println(new Carro("Chevrolet1").hashCode());*/

        //qualquer leve alteração no obj, altera completamente o hashCode do mesmo;
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("ford").hashCode());

        System.out.println(new Carro("Ford").equals(new Carro("Chevrolet")));

        //criando novos objetos "carro";
        Carro carro1 = new Carro("Gol");
        Carro carro2 = new Carro("Civic");
        Carro carro3 = new Carro("Civic");

        //testando método equals;
        System.out.println(carro1.equals(carro2));
        System.out.println(carro2.equals(carro3));
    }
}
