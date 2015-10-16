/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author UDESC
 */
public class FilaEncadeada<T> {
    Elemento<T> primeiro;
    Elemento<T> ultimo;
    int numeroElementos;

    public FilaEncadeada() {
        this.numeroElementos = 0;
    }
    
    public boolean adiciona(T valor){
        if(this.numeroElementos==0){
            this.primeiro = this.ultimo = new Elemento(valor);
            this.numeroElementos = 1;
        }else{
            Elemento<T> novoElemento = new Elemento(valor);
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
            this.numeroElementos++;
        }
        return true;
    }


    public T remove(){
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

    public void mostrarFila(){
        Elemento<T> elementoAtual = this.primeiro;
        for(int i=0; i<this.numeroElementos; i++){
            System.out.println("Elemento n°"+i+" = "+elementoAtual.getValor());
            elementoAtual = elementoAtual.getProximo();
        }
    }
}
