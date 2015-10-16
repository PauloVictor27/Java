/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve os atributos do frango
 * @author UDESC
 */
public class Frango extends Animais{
    private int idade;
    private int peso;
    private Racao racao;
    
    //Declara a racao do frango
    public Frango(){
        racao = new Racao();
    }

    /**
     * Obtem a idade do frango
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Configura a idade do frango
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Obtem o peso do frango
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * Configura o peso do frango
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Obtem a racao
     * @return the racao
     */
    public Racao getRacao() {
        return racao;
    }

    /**
     * Configura a racao
     * @param racao the racao to set
     */
    public void setRacao(Racao racao) {
        this.racao = racao;
    }
}
