/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author UDESC
 */
public class Elemento<T> {
    private Elemento<T> proximo;
    private T valor;

    /**
     * @return the proximo
     */
    public Elemento<T> getProximo() {
        return proximo;
    }

    public Elemento(T valor) {
        this.valor = valor;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(Elemento<T> proximo) {
        this.proximo = proximo;
    }

    /**
     * @return the valor
     */
    public T getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(T valor) {
        this.valor = valor;
    }

}
