package com.arvorebinaria;

//import com.arvorebinaria.model.Obj;

public class Main {
    public static void main(String[] args) {
        
        ArvoreBinaria<Integer> arvoreBinaria = new ArvoreBinaria<>();

        //inserir
        arvoreBinaria.inserir((13));
        arvoreBinaria.inserir((10));
        arvoreBinaria.inserir((25));
        arvoreBinaria.inserir((2));
        arvoreBinaria.inserir((12));
        arvoreBinaria.inserir((20));
        arvoreBinaria.inserir((31));
        arvoreBinaria.inserir((29));
        arvoreBinaria.inserir((32));

        //Em ordem
        arvoreBinaria.exibirEmOrdem();
        //Pre Ordem
        arvoreBinaria.exibirPreOrdem();
        //Pos Ordem
        arvoreBinaria.exibirPosOrdem();

        System.out.println("---");

        //remove
        arvoreBinaria.remover(2);
        arvoreBinaria.remover(29);
        arvoreBinaria.remover(32);
        arvoreBinaria.exibirEmOrdem();


    }
    
}
