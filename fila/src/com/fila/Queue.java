package com.fila;

public class Queue<T> {

    private Node<T> refNodeEntry;

    public Queue() {
        this.refNodeEntry = null;
    }

    //MÉTODO DE ADICIONAR NOVO NÓ NA FILA.
    /* public void enqueue(Node newNode){
        newNode.setRefNextNode(refNodeEntry);
        refNodeEntry = newNode;
    } */
    
    //Refatoração, imbutindo Nó
    public void enqueue(T object){
        Node<T> newNode = new Node<T>(object);
        newNode.setRefNextNode(refNodeEntry);
        refNodeEntry = newNode;
        
    }

    //MÉTODO PARA MOSTRAR O PRIMEIRO NÓ
    /* public Node first(){
        if(!this.isEmpty()){
            Node firstNode = refNodeEntry;
            while(true){
                if(firstNode.getRefNextNode() != null){
                    firstNode = firstNode.getRefNextNode();
                }else{
                    break;
                }
            }
            return firstNode;
        }
        return null;
    } */

    //Refatoração imbutindo Nó, substituindo Node por Object...
    public T first(){
        if(!this.isEmpty()){
            Node<T> firstNode = refNodeEntry;
            while(true){
                if(firstNode.getRefNextNode() != null){
                    firstNode = firstNode.getRefNextNode();
                }else{
                    break;
                }
            }
            return (T) firstNode.getObject();//Casting
        }
        return null;
    }
    //MÉTODO PARA MOSTRAR O PRIMEIRO NÓ
    /* public Node dequeue(){
        if(!this.isEmpty()){
            Node firstNode = refNodeEntry;
            Node nodeAuxiliary = refNodeEntry;
            while(true){
                if(firstNode.getRefNextNode() != null){
                    nodeAuxiliary = firstNode;
                    firstNode = firstNode.getRefNextNode();
                }else{
                    nodeAuxiliary.setRefNextNode(null);
                    break;
                }
            }
            return firstNode;
        }
        return null;
    } */
    
    //Refatoração imbutindo Nó, substituindo Node por Object...
    public T dequeue(){
        if(!this.isEmpty()){
            Node<T> firstNode = refNodeEntry;
            Node<T> nodeAuxiliary = refNodeEntry;
            while(true){
                if(firstNode.getRefNextNode() != null){
                    nodeAuxiliary = firstNode;
                    firstNode = firstNode.getRefNextNode();
                }else{
                    nodeAuxiliary.setRefNextNode(null);
                    break;
                }
            }
            return (T) firstNode.getObject(); //Casting...
        }
        return null;
    }
    public boolean isEmpty(){
        return refNodeEntry == null? true : false;
    }

    @Override
    public String toString(){
        String stringReturn = "";

        Node<T> nodeAuxiliary = refNodeEntry;
        
        if(refNodeEntry != null){
            while(true){
                stringReturn += "[Node{object=" + nodeAuxiliary.getObject() + "}]--->";
                if(nodeAuxiliary.getRefNextNode() != null){
                    nodeAuxiliary = nodeAuxiliary.getRefNextNode();
                }else{
                    stringReturn += "null";
                    break;
                }
            }
        }else{
            stringReturn = "null";
        }

        return stringReturn;
    }
    
}
