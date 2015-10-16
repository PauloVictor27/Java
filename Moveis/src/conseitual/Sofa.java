/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

import ui.Cadastro;

/**
 *
 * @author PauloVitor
 */
public class Sofa {
    private int tamanho;
    private int preco;
    private String material;
    private int nPessoas;

    public Sofa() {
        Cadastro.nMoveis++;
    }

    public Sofa(int tamanho, int preco, String material, int nPessoas) {
        this.tamanho = tamanho;
        this.preco = preco;
        this.material = material;
        this.nPessoas = nPessoas;
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the nPessoas
     */
    public int getnPessoas() {
        return nPessoas;
    }

    /**
     * @param nPessoas the nPessoas to set
     */
    public void setnPessoas(int nPessoas) {
        this.nPessoas = nPessoas;
    }
}
