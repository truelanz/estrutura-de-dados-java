package com.listacircular;
public class Node<T> {

    private T elemento;
    private Node<T> proximoNode;

    public Node(T elemento) {
        this.elemento = elemento;
        this.proximoNode = null;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public Node<T> getProximoNode() {
        return proximoNode;
    }

    public void setProximoNode(Node<T> elemento2) {
        this.proximoNode = elemento2;
    }

    @Override
    public String toString() {
        return "Node {elemento=" + elemento + "}";
    }    
}
