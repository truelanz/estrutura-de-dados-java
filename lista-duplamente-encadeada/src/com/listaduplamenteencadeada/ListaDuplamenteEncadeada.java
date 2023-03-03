package com.listaduplamenteencadeada;
/**
 * Nesta classe contém os métodos:
 * get, add (começo), add(final), add(index), remove,
 * isEmpty, size e toString; 
 */
public class ListaDuplamenteEncadeada<T> {

    private NodeDuplo<T> primeiroNode;
    private NodeDuplo<T> ultimoNode;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNode = null;
        this.ultimoNode = null;
        this.tamanhoLista = 0;
    }

    //MÉTODO GET
    public T get(int index){
        return this.getNode(index).getConteudo();
    }
    //MÉTODO ADD (começo da lista, ex: adcionando 00 --> [00, 1, 9, 70])
    public void addComeco(T elemento){
        NodeDuplo<T> novoNode = new NodeDuplo<>(elemento);
        novoNode.setProximoNode(primeiroNode);
        primeiroNode = novoNode;
    }

    //MÉTODO ADD (final da lista, ex: adcionando 00 --> [1, 9, 70, 00])
    public void addFinal(T elemento){
        NodeDuplo<T> novoNode = new NodeDuplo<>(elemento);
        //adicionar novo Node pra frente, onde é null.
        novoNode.setProximoNode(null);
        //Tornar o novo Node o ultimo Node(?)
        novoNode.setNodeAnterior(ultimoNode);
        //Se não existir Node, o novo Node passa a ser o primeiro Node.
        if(primeiroNode == null){
            primeiroNode = novoNode;
        }
        if(ultimoNode != null){
            ultimoNode.setProximoNode(novoNode);
        }
        ultimoNode = novoNode;
        //sempre que adicionar um novo nó aumentar +1 no tamanho da lista.
        tamanhoLista++;
    }  

    //MÉTODO ADD (por index) - adicionar em qualquer lugar que a pessoa quiser.
    public void add(int index, T elemento){

        NodeDuplo<T> nodeAuxiliar = getNode(index);
        NodeDuplo<T> novoNode = new NodeDuplo<>(elemento);
        novoNode.setProximoNode(nodeAuxiliar);

        if(novoNode.getProximoNode() != null){
            novoNode.setNodeAnterior(nodeAuxiliar.getNodeAnterior());
            novoNode.getProximoNode().setNodeAnterior(novoNode);
        }else{
            novoNode.setNodeAnterior(ultimoNode);
            ultimoNode = novoNode;
        }
        if(index == 0){
            primeiroNode = novoNode;
        }else{
            novoNode.getNodeAnterior().setProximoNode(novoNode);
        }
        //sempre que adicionar um novo nó aumentar +1 no tamanho da lista.
        tamanhoLista++;
    }

    //Método REMOVE. (remover pelo indice)
    public void remove(int index){
        if(index == 0){
            primeiroNode = primeiroNode.getProximoNode();
            if(primeiroNode != null){
                primeiroNode.setNodeAnterior(null);
            }
        }else{
            NodeDuplo<T> nodeAuxiliar = getNode(index);
            nodeAuxiliar.getNodeAnterior().setProximoNode(nodeAuxiliar.getProximoNode());
            if(nodeAuxiliar != ultimoNode){
                nodeAuxiliar.getProximoNode().setNodeAnterior(nodeAuxiliar.getNodeAnterior());
            }else{
                ultimoNode = nodeAuxiliar;
            }

        }
        //quando o método é 'void' ele volta 'this.' e não 'return';
        this.tamanhoLista--; 
    }

    //MÉTODO GETNODE
    private NodeDuplo<T> getNode(int index){
        NodeDuplo<T> nodeAuxiliar = primeiroNode;
        for(int i = 0; (i < index) && (nodeAuxiliar != null); i++){
            nodeAuxiliar = nodeAuxiliar.getProximoNode();
        }
        return nodeAuxiliar;
    }

    //MÉTODO SIZE (ver tamanho da lista).
    public int size(){
        return tamanhoLista;
    }

    //MÉTODO isEmpty.
    public boolean isEmpty(){
        if(size() != 0)
            return false;
        else
            return true;
    }

    //Métodos toString...
    /* @Override
    public String toString(){
        String strRetorno = ""; 
        NodeDuplo<T> nodeAuxiliar = primeiroNode;
        for(int i = 0; i < size(); i++){
            strRetorno += "[Node{conteudo=" + nodeAuxiliar.getConteudo() + "}]--->";
            nodeAuxiliar = nodeAuxiliar.getProximoNode();
        }
        //quando sair do laço for, ou seja quando 'i' for = a 'size', significa que acabou a lista.
        //returna null; 
        strRetorno += "null";

        return strRetorno;
    } */

    /* StringBuffer é mais rápido que o String. StringBuffer é sincronizado
    Assim, você garante a consistência do seu código quando há diversas 
    threads lendo ou modificando a mesma String. */
    @Override
    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ ");

        NodeDuplo<T> nodeAuxiliar = primeiroNode;
        while(nodeAuxiliar != null){
            stringBuffer.append(nodeAuxiliar.getConteudo() + ", ");
            nodeAuxiliar = nodeAuxiliar.getProximoNode();
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
    
}
