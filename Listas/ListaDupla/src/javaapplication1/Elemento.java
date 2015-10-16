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
    private Elemento<T> anterior;
    private Elemento<T> proximo;
    private T valor;

    /**
     * @return the anterior
     */
    public Elemento<T> getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Elemento<T> anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the proximo
     */
    public Elemento<T> getProximo() {
        return proximo;
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
