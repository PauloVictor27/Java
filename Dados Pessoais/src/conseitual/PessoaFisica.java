/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

import ui.PrincipalPessoa;

/**
 *
 * @author UDESC
 */
public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;
    private int nFilhos;

    public PessoaFisica() {
        PrincipalPessoa.nPessoas++;
    }

    public PessoaFisica(String cpf, String rg, int nFilhos) {
        this.cpf = cpf;
        this.rg = rg;
        this.nFilhos = nFilhos;
        PrincipalPessoa.nPessoas++;
    }

    public PessoaFisica(String nome, int idade, String endereco, String cpf, String rg, int nFilhos){
        this.cpf = cpf;
        this.rg = rg;
        this.nFilhos = nFilhos;
        //Pai
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        PrincipalPessoa.nPessoas++;
    }
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @return the nFilhos
     */
    public int getnFilhos() {
        return nFilhos;
    }

    /**
     * @param nFilhos the nFilhos to set
     */
    public void setnFilhos(int nFilhos) {
        this.nFilhos = nFilhos;
    }

}
