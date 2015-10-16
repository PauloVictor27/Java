/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve os atributos do coodenador
 * @author UDESC
 */
public class Coodenador extends Funcionario{
    private String nome;
    private int idade;

    /**
     * Obtem o nome do coodenador
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Configura o nome do coodenador
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtem a idade do coodenador
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Configura a idade coodenador
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
