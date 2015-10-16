/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que encapsula o conceito de roda
 * @author UDESC
 */
public class Roda {
    private String marca;
    private int tamanhoArco;

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**Obtem
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**Retorna
     * @return the tamanhoArco
     */
    public int getTamanhoArco() {
        return tamanhoArco;
    }

    /**Obtem
     * @param tamanhoArco the tamanhoArco to set
     */
    public void setTamanhoArco(int tamanhoArco) {
        this.tamanhoArco = tamanhoArco;
    }
}
