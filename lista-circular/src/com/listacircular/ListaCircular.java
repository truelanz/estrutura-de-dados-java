package com.listacircular;
public class ListaCircular<T> {

    Node<T> cabeca;
    Node<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }

    public void add(T elemento){
        Node<T> novoNode = new Node<>(elemento);
        if(isEmpty()){
            this.cauda = novoNode;
            this.cabeca = this.cauda;
            this.cabeca.setProximoNode(cauda);
        }else{
            //Se a lista não estiver vazia, setar(apontas) novo Node para o atual primeiro Node (this.cauda);
            //Tornando assim o novo Node a nova cauda declarando ---> this.cauda = novoNode; 
            novoNode.setProximoNode(this.cauda);
            this.cabeca.setProximoNode(novoNode);
            this.cauda = novoNode;
        }
        this.tamanhoLista++;
    }
    //remove

    public void remove(int index){
        if(index >= this.tamanhoLista && index <= this.tamanhoLista)
            throw new IndexOutOfBoundsException("Esse índice não existe nesta Lista!");
        Node<T> nodeAuxiliar = this.cauda;
     /* É necessário substituir o node cauda para o node da frente, caso o usuário remova o índice 0.
        Também é necessário setar o próximo node da "cabeça" para o novo node 0: */
        if(index == 0){
            this.cauda = this.cauda.getProximoNode();
            this.cabeca.setProximoNode(this.cauda);
        }else if(index == 1){
            this.cauda.setProximoNode(this.cauda.getProximoNode().getProximoNode());
        }else{
        /*  É necessário correr a lista sempre um índice antes do que queremos remover (index-1),
            para que pegue o anterior e o posterior do que será removido [...]*/
            for(int i = 0; i < index-1; i++){
                nodeAuxiliar = nodeAuxiliar.getProximoNode();
            }
            /*[...] Pulando assim o Node que desejamos remover com "2 .getProximoNode()".
            Setando o Node anterior do removido com o Node posterior do mesmo, fazendo com
            que a JVM elimine o Node "esquecido"!*/
            nodeAuxiliar.setProximoNode(nodeAuxiliar.getProximoNode().getProximoNode());
        }
        this.tamanhoLista--;
    }

    //get
    public T get(int index){
        return this.getNode(index).getElemento();
    }

    //getNode
    private Node<T> getNode(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A Lista está vazia!");
        if(index == 0){
            return this.cauda;
            }
        //Correr a lista e mostrar os Nós subjacentes.
        Node<T> nodeAuxiliar = this.cauda;
        for(int i = 0; i < index; i++){
            nodeAuxiliar = nodeAuxiliar.getProximoNode();
        }
        return nodeAuxiliar;
    }
    
    //isEmpty
    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }
    
    //size
    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString(){
        String strReturn = "";
        Node<T> nodeAuxiliar = cauda;
        for(int i = 0; i < this.size(); i++){
            strReturn += "[Node {elemento = " + nodeAuxiliar.getElemento() + "}->";
            nodeAuxiliar = nodeAuxiliar.getProximoNode();
        }
        strReturn += !this.isEmpty() ? "(Voltou ao início)>>>[" + cauda : "[ ]";
        return strReturn;
    }
}
