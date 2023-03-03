package com.fila;

//Classe criada como object, depois refatoraga com generics...
public class Node<T> {

    private T object;
    private Node<T> refNextNode;

    public Node(){
    }

    public Node(T object){
        this.refNextNode = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node<T> getRefNextNode() {
        return refNextNode;
    }

    public void setRefNextNode(Node<T> refNextNode) {
        this.refNextNode = refNextNode;
    }

    @Override
    public String toString() {
        return "Node [object = " + object + "]";
    }
    

    
}
