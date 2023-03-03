package com.arvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNode<T> raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    //inserir
    public void inserir(T conteudo){
        BinNode<T> novoNode = new BinNode<>(conteudo);
        raiz = inserir(raiz, novoNode);
    }

    private BinNode<T> inserir(BinNode<T> atualNode, BinNode<T> novoNode){
        if(atualNode == null){
            return novoNode;
        }else if(novoNode.getConteudo().compareTo(atualNode.getConteudo()) < 0){
            atualNode.setNodeEsq(inserir(atualNode.getNodeEsq(), novoNode));
        }else{
            atualNode.setNodeDir(inserir(atualNode.getNodeDir(), novoNode));
        }
        return atualNode;
    }

    //------------------------MÉTODOS DE EXIBIÇÃO--------------------------------\\
    
    //exibição EM-ORDEM
    public void exibirEmOrdem(){
        System.out.print("\n Exibindo Em-Ordem: ");
        exibirEmOrdem(this.raiz);
    }
    
    private void exibirEmOrdem(BinNode<T> atualNode){
        if(atualNode != null){
            exibirEmOrdem(atualNode.getNodeEsq());
            System.out.print(atualNode.getConteudo() + ", ");
            exibirEmOrdem(atualNode.getNodeDir());
        }
    }
    
    //exibição POS-ORDEM
    public void exibirPosOrdem(){
        System.out.print("\n Exibindo Pós-Ordem: ");
        exibirPosOrdem(this.raiz);
    }
    
    private void exibirPosOrdem(BinNode<T> atualNode){
        if(atualNode != null){
            exibirPosOrdem(atualNode.getNodeEsq());
            exibirPosOrdem(atualNode.getNodeDir());
            System.out.print(atualNode.getConteudo() + ", ");
        }
    }
    
    //exibição PRÉ-ORDEM
    public void exibirPreOrdem(){
        System.out.print("\n Exibindo Pré-Ordem: ");
        exibirPreOrdem(this.raiz);
    }
    
    private void exibirPreOrdem(BinNode<T> atualNode){
        if(atualNode != null){
            System.out.print(atualNode.getConteudo() + ", ");
            exibirPreOrdem(atualNode.getNodeEsq());
            exibirPreOrdem(atualNode.getNodeDir());
        }
    }
    //----------------------FIM DOS MÉTODOS DE EXIBIÇÃO--------------------------\\
    
    //-------------------------------MÈTODO REMOVE-------------------------------\\
    public void remover(T conteudo){
        try {
            BinNode<T> atualNode = this.raiz;
            BinNode<T> pai = null;
            BinNode<T> filho = null;
            BinNode<T> temp = null;
            
            while(atualNode != null && !atualNode.getConteudo().equals(conteudo)){
                pai = atualNode;
                //Se o conteúdo que for remover é menor que o nodeAtual (o pai)...
                if(conteudo.compareTo(atualNode.getConteudo()) < 0){ 
                    //...pegar o da esquerda...
                    atualNode = atualNode.getNodeEsq();
                }else{
                    //...se não for menor, pegar o da direita
                    atualNode = atualNode.getNodeDir();
                }
            }
            //Se o Node raiz for nulo...
            if(atualNode == null){
                System.out.println("Conteudo nao encontrado. Bloco Try...");
            }
            
            //Cado o node pai, e os filhos a esquerda e direita forem nulos...
            if(pai == null){
                if(atualNode.getNodeDir() == null){
                    this.raiz = atualNode.getNodeEsq();
                }else if(atualNode.getNodeEsq() == null){
                    this.raiz = atualNode.getNodeDir();
                }else{
                    //...caso não forem nulos...
                    for(temp = atualNode, filho = atualNode.getNodeEsq();
                    filho.getNodeDir() != null;
                    temp = filho, filho = filho.getNodeEsq()){
                        if(filho != atualNode.getNodeEsq()){
                            temp.setNodeDir(filho.getNodeEsq());
                                filho.setNodeEsq(raiz.getNodeEsq());
                            }
                        }
                        filho.setNodeDir(raiz.getNodeDir());
                        raiz = filho;
                    }
                    
                }else if(atualNode.getNodeDir() == null){
                    if(pai.getNodeEsq() == atualNode){
                        pai.setNodeEsq(atualNode.getNodeEsq());
                    }else{
                        pai.setNodeDir(atualNode.getNodeEsq());
                    }
                    
                }else if(atualNode.getNodeEsq() == null){
                    if(pai.getNodeEsq() == atualNode){
                        pai.setNodeEsq(atualNode.getNodeDir());
                    }else{
                        pai.setNodeDir(atualNode.getNodeDir());
                    }
            }else{
                for(
                    temp = atualNode, filho = atualNode.getNodeEsq();
                    filho.getNodeDir() != null;
                    temp = filho, filho = filho.getNodeDir()
                    ){
                        if(filho != atualNode.getNodeEsq()){
                            temp.setNodeDir(filho.getNodeEsq());
                            filho.setNodeEsq(atualNode.getNodeDir());
                        }
                        filho.setNodeDir(atualNode.getNodeDir());
                        if(pai.getNodeDir() == atualNode){
                            pai.setNodeEsq(temp);
                        }else{
                            pai.setNodeDir(filho);
                        }
                    }
                }
                
            } catch (NullPointerException erro){
                System.out.println("Conteudo nao encontrado. Bloco Catch...");            
            }
        }
        //---------------------------FIM MÈTODO REMOVE-------------------------------\\
}
