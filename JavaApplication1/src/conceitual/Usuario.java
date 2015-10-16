/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conceitual;

/**
 *
 * @author PauloVitor
 */
public class Usuario {
    private String nome;
    private int tiro;
    private int pontuacao;

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
     * @return the tiro
     */
    public int getTiro() {
        return tiro;
    }

    /**
     * @param tiro the tiro to set
     */
    public void setTiro(int tiro) {
        this.tiro = tiro;
    }

    /**
     * @return the pontuacao
     */
    public int getPontuacao() {
        return pontuacao;
    }

    /**
     * @param pontuacao the pontuacao to set
     */
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }
}
