/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author UDESC
 */
public class ListaSimples<T> {
    Elemento<T> primeiro;
    int numeroElementos;

    public ListaSimples() {
        this.numeroElementos = 0;
    }

    private void inserePrimeiro(T valor){
        this.primeiro = new Elemento<T>(valor);
        this.numeroElementos = 1;
    }
    
    public boolean adicionaNoFim(T valor){
        if(this.numeroElementos==0){
            this.inserePrimeiro(valor);
        }else{
            Elemento<T> novoElemento = new Elemento<T>();
            novoElemento.setValor(valor);
            Elemento<T> elt =  this.primeiro;
            while(elt.getProximo()!=null){
                elt = elt.getProximo();
            }
            elt.setProximo(novoElemento);
            this.numeroElementos++;
        }
        return true;
    }

    public boolean adicionaNoInicio(T valor){
        if(this.numeroElementos==0){
            this.inserePrimeiro(valor);
        }else{
            Elemento<T> novoElemento = new Elemento<T>();
            novoElemento.setValor(valor);
            novoElemento.setProximo(this.primeiro);
            this.primeiro = novoElemento;
            this.numeroElementos++;
        }
        return true;
    }

    public T removeNoInicio(){
        T conteudo = this.primeiro.getValor();
        if(this.numeroElementos<=1){
            this.primeiro = null;
            this.numeroElementos = 0;
        }else{
            this.primeiro = this.primeiro.getProximo();
            this.numeroElementos--;
        }
        return conteudo;
    }

    public T removeNoFim(){
        T conteudo;
        if(this.numeroElementos<=1){
            conteudo = this.primeiro.getValor();
            this.primeiro = null;
            this.numeroElementos = 0;
        }if(this.numeroElementos==2){
            conteudo = this.primeiro.getProximo().getValor();
            this.primeiro.setProximo(null);
            this.numeroElementos--;
        }else{
            Elemento<T> elt =  this.primeiro;
            while(elt.getProximo().getProximo()!=null){
                elt = elt.getProximo();
            }
            conteudo = elt.getProximo().getValor();
            elt.setProximo(null);
            this.numeroElementos--;
        }
        return conteudo;
    }

    public void mostrarLista(){
        Elemento<T> elementoAtual = this.primeiro;
        for(int i=0;i<this.numeroElementos;i++){
            System.out.println("Elemento n°"+i+" = "+elementoAtual.getValor());
            elementoAtual = elementoAtual.getProximo();
        }
    }

}
