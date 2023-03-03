package com.listaduplamenteencadeada;

public class NodeDuplo<T> {

    //conteúdo do nó (o objeto).
    private T conteudo;
    //um ponto de referência para o próximo nó.
    private NodeDuplo<T> proximoNode;
    //um ponto de referência pra o nó anterior.
    private NodeDuplo<T> nodeAnterior;

    //construtor que retorna conteúdo do método (.this)
    public NodeDuplo(T conteudo){
        this.conteudo = conteudo;
    }

    //getters and setters:
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NodeDuplo<T> getProximoNode() {
        return proximoNode;
    }

    public void setProximoNode(NodeDuplo<T> proximoNo) {
        this.proximoNode = proximoNo;
    }

    public NodeDuplo<T> getNodeAnterior() {
        return nodeAnterior;
    }

    public void setNodeAnterior(NodeDuplo<T> noAnterior) {
        this.nodeAnterior = noAnterior;
    }

    //ToString...
    @Override
    public String toString() {
        return "NodeDuplo [conteudo=" + conteudo + "]";
    }
    
    
}
