package com.arvorebinaria;

public class BinNode<T extends Comparable<T>> {

    private T conteudo;
    private BinNode<T> nodeEsq;
    private BinNode<T> nodeDir;

    public BinNode(T conteudo) {
        this.conteudo = conteudo;
        this.nodeEsq = this.nodeDir = null;
    }

    public BinNode() {
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNode<T> getNodeEsq() {
        return nodeEsq;
    }

    public void setNodeEsq(BinNode<T> nodeEsq) {
        this.nodeEsq = nodeEsq;
    }

    public BinNode<T> getNodeDir() {
        return nodeDir;
    }

    public void setNodeDir(BinNode<T> nodeDir) {
        this.nodeDir = nodeDir;
    } 

    @Override
    public String toString() {
        return "BinNode [conteudo=" + conteudo + "]";
    }
}
