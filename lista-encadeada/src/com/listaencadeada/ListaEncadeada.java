package com.listaencadeada;

public class ListaEncadeada<T> {

    Node<T> entryRef;
    
    //Constructor
    public ListaEncadeada(){
        this.entryRef = null;
    }
    
    //Método add
    public void add(T contentT){
        Node<T> newNode = new Node<>(contentT);
        if(this.isEmpty()){
            entryRef = newNode;
            return;
        }
        Node<T> auxiliaryNode = entryRef;
        for(int i = 0; i < size() -1; i++){
            auxiliaryNode = auxiliaryNode.getNextNode();
        }
        auxiliaryNode.setNextNode(newNode);
    }

    //Método get;
    public T get(int index){
        return getNode(index).getContentT();
    }

    //Método getNode
    private Node<T> getNode(int index){
        indexValidate(index);
        Node<T> auxiliaryNode = entryRef;
        Node<T> returnNode = null;
        for(int i = 0; i <= index; i++){
            returnNode = auxiliaryNode;
            auxiliaryNode = auxiliaryNode.getNextNode();
        }
        return returnNode;
    }

    //Método remove
    public T remove(int index){
        indexValidate(index);
        Node<T> removeNode = getNode(index);
        if(index == 0){
            entryRef = removeNode.getNextNode();
            return removeNode.getContentT();
        }
        Node<T> previousNode = getNode(index - 1);
        previousNode.setNextNode(removeNode.getNextNode());
        return removeNode.getContentT();
    }

    //Método size
    public int size(){
        int sizeList = 0;
        Node<T> auxiliaryRef = entryRef;
        while(true){
            if(entryRef != null){
                sizeList++;
                if(auxiliaryRef.getNextNode() != null){
                    auxiliaryRef = auxiliaryRef.getNextNode();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return sizeList;
    }
    
    //Método para verificar útimo índice da lista e validar outros métodos...
    public void indexValidate(int index){
        if(index >= size()){
            int lastIndex = size() - 1;
            throw new IndexOutOfBoundsException("Não há conteúdo no índice" + index + "desta lista. Índice máximo desta lista é: " + lastIndex + ".");
        }
    }

    //Método isEmpty
    public boolean isEmpty(){
        return entryRef == null? true : false;
    }

    public Node<T> getEntryRef() {
        return entryRef;
    }

    public void setEntryRef(Node<T> entryRef) {
        this.entryRef = entryRef;
    }


    @Override
    public String toString(){
        String strReturn = "";
        Node<T> auxiliaryNode = entryRef;
        for(int i = 0; i < size(); i++){
            strReturn += "Node{content=" + auxiliaryNode.getContentT() + "}--->";
            auxiliaryNode = auxiliaryNode.getNextNode();
        }
        strReturn += "null";
        return strReturn;
    }
    
}
