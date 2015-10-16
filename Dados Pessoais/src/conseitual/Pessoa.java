/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

import ui.PrincipalPessoa;

/**
 * Classe que modela o conceito de pessoa
 * @author UDESC
 */
public class Pessoa {
    protected String nome;
    protected int idade;
    protected String endereco;
    
    //Declaracao vazia
    public Pessoa(){
        PrincipalPessoa.nPessoas++;
    }

    //Preenchendo dados da pessoas
    public Pessoa(String nome, int idade, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;

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
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
