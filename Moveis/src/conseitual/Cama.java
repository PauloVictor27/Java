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
public class Cama {
    private int tamanho;
    private int preco;
    private int nPessoas;

    public Cama() {
        Cadastro.nMoveis++;
    }

    public Cama(int tamanho, int preco, int nPessoas) {
        this.tamanho = tamanho;
        this.preco = preco;
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
