/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package carro;

/**
 *
 * @author PauloVitor
 */
public abstract class Carro {
    private String modelo;
    private String cor;
    private String combustivel;
    private String informacao;

    public abstract void registro (String dado);

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the combustivel
     */
    public String getCombustivel() {
        return combustivel;
    }

    /**
     * @param combustivel the combustivel to set
     */
    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    /**
     * @return the informacao
     */
    public String getInformacao() {
        return informacao;
    }

}
