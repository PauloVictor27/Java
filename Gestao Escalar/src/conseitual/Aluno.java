/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 *Classe que descreve os atributos do aluno
 * @author UDESC
 */
public class Aluno {
    private String nome;
    private int idade;
    private String matricula;

    /**
     * Obtem o nome do aluno
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Configura o nome do aluno
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtem a idade do aluno
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Configura a idade do aluno
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Obtem a matricula do aluno
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Configura a matricula do aluno
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
