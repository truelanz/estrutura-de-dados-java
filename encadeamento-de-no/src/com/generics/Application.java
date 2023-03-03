package com.generics;

public class Application {

    public static void main(String[] args) {
        
        //TYPE SAFETY
        List<Double> list = new List<>();

        list.add(9.8);
        list.add(3.5);
        list.add(4.7);

        System.out.println(list);
    }
}
