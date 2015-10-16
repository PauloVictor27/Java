/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve os atributos do professor
 * @author UDESC
 */
public class Professor extends Funcionario {
    private String nome;
    private int idade;

    /**
     * Obtem o nome do professor
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Configura o nome do professor
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtem a idade do professor
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * COnfigura a idade do professor
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
