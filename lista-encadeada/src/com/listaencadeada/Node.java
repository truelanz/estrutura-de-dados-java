package com.listaencadeada;

public class Node<T> {

    private T contentT;
    private Node<T> nextNode = null;

    public Node(T contentT) {
        this.contentT = contentT;
    }
    public Node(T contentT, Node<T> nextNode) {
        this.contentT = contentT;
        this.nextNode = nextNode;
    }
    public T getContentT() {
        return contentT;
    }
    public void setContentT(T contentT) {
        this.contentT = contentT;
    }
    public Node<T> getNextNode() {
        return nextNode;
    }
    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }
    @Override
    public String toString() {
        return "Node [contentT=" + contentT + "]";
    }

    public String toStringEncadeado(){
        String str = "Node{" + "contentT=" + contentT + "}";

        if(nextNode != null){
            str += "->" + nextNode.toString();
        }else {
            str += "->null";
        }
        return str;

    }
}

    
