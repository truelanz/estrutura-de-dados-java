package com.pilhas;

public class Pilha {

    private No refNoEntradaPilha;

    //Construtor da Pilha;
    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    //Método que Põe novos elementos na pilha.
    public void push(No novoNo){
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }
    //Pega útimo Nó da pilha, removendo-o e colocando o Nó abaixo como referencia de útimo Nó.
    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }
    //Método que pega como referência o útimo elemento da pilha;
    public No top(){
        return refNoEntradaPilha;
    }
    //Método que confere que um item da pilha está "null" ou não;
    public boolean isEmpty(){
        return refNoEntradaPilha == null ? true : false;
    }
    @Override
    public String toString() {
        String stringRetorno = "--------------\n";
        stringRetorno += "  Pilha\n";
        stringRetorno += "--------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
            stringRetorno += "[Nó{dado=" + noAuxiliar.getDado() + "}]\n";
            noAuxiliar = noAuxiliar.getRefNo();
        }
        else{
            break;
        } 
    }
    stringRetorno += "==============\n";
    return stringRetorno;
    
    }
}
