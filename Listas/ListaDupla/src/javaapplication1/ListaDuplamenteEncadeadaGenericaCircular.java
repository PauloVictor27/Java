/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author UDESC
 */
public class ListaDuplamenteEncadeadaGenericaCircular<T> {
    Elemento<T> primeiro;
    int numeroElementos;

    public ListaDuplamenteEncadeadaGenericaCircular() {
        this.numeroElementos = 0;
    }

    private void inserePrimeiro(T valor){
        this.primeiro = new Elemento<T>();
        this.primeiro.setAnterior(this.primeiro);
        this.primeiro.setProximo(this.primeiro);
        this.primeiro.setValor(valor);
        this.numeroElementos = 1;
    }
    
    public boolean AdicionaNoFim(T valor){
        if(this.numeroElementos==0){
            this.inserePrimeiro(valor);
        }else{
            AdicionaNoInicio(valor);
            this.primeiro = this.primeiro.getProximo();
        }
        return true;
    }
    public boolean AdicionaNoInicio(T valor){
        if(this.numeroElementos==0){
            this.inserePrimeiro(valor);
        }else{
            Elemento<T> novoelemento = new Elemento();
            novoelemento.setValor(valor);
            novoelemento.setProximo(this.primeiro);
            novoelemento.setAnterior(this.primeiro.getAnterior());
            this.primeiro.getAnterior().setProximo(novoelemento);
            this.primeiro.setAnterior(novoelemento);
            this.primeiro = novoelemento;
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
            this.primeiro.getProximo().setAnterior(this.primeiro.getAnterior());
            this.primeiro.getAnterior().setProximo(this.primeiro.getProximo());
            this.primeiro = this.primeiro.getProximo();
            this.numeroElementos--;
        }
        return conteudo;
    }

    public T removeNoFim(){
        T conteudo = this.primeiro.getAnterior().getValor();
        if(this.numeroElementos<=1){
            this.primeiro = null;
            this.numeroElementos = 0;
        }else{
            this.primeiro.getAnterior().getAnterior().setProximo(this.primeiro);
            this.primeiro.setAnterior(this.primeiro.getAnterior().getAnterior());
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
