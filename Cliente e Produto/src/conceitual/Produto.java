/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conceitual;

import java.io.Serializable;

/**
 *
 * @author UDESC
 */
public class Produto implements Serializable{
    private String nome;
    private float preco;

    public Produto() {
    }

    public Produto(String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
