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
public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String inscEstadual;
    private String enderecoCobranca;
    private int nFiliais;

    public PessoaJuridica() {
        PrincipalPessoa.nPessoas++;
    }

    public PessoaJuridica(String cnpj, String inscEstadual, String enderecoCobranca, int nFiliais) {
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.enderecoCobranca = enderecoCobranca;
        this.nFiliais = nFiliais;
        PrincipalPessoa.nPessoas++;
    }

    public PessoaJuridica(String nome, int idade, String endereco, String cnpj, String inscEstadual, String enderecoCobranca, int nFiliais) {
        this.cnpj = cnpj;
        this.inscEstadual = inscEstadual;
        this.enderecoCobranca = enderecoCobranca;
        this.nFiliais = nFiliais;
        //Pai
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        PrincipalPessoa.nPessoas++;
    }


    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the inscEstadual
     */
    public String getInscEstadual() {
        return inscEstadual;
    }

    /**
     * @param inscEstadual the inscEstadual to set
     */
    public void setInscEstadual(String inscEstadual) {
        this.inscEstadual = inscEstadual;
    }

    /**
     * @return the enderecoCobranca
     */
    public String getEnderecoCobranca() {
        return enderecoCobranca;
    }

    /**
     * @param enderecoCobranca the enderecoCobranca to set
     */
    public void setEnderecoCobranca(String enderecoCobranca) {
        this.enderecoCobranca = enderecoCobranca;
    }

    /**
     * @return the nFiliais
     */
    public int getnFiliais() {
        return nFiliais;
    }

    /**
     * @param nFiliais the nFiliais to set
     */
    public void setnFiliais(int nFiliais) {
        this.nFiliais = nFiliais;
    }

}
