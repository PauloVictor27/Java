/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve os atributos dos cereais
 * @author UDESC
 */
public class Cereais extends Comida{
    private int peso;

    /**
     * Obtem o peso dos cereais
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Configura o peso dos cereai
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

}
