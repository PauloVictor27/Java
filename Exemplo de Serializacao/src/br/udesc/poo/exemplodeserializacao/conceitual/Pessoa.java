/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.poo.exemplodeserializacao.conceitual;

import java.io.Serializable;

/**
 *
 * @author UDESC
 */
public class Pessoa implements Serializable{

    private String nome;
    private String telefone;
    private Genero genero;
    private Profissao profissao;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, Genero genero, Profissao profissao) {
        this.nome = nome;
        this.telefone = telefone;
        this.genero = genero;
        this.profissao = profissao;
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
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    /**
     * @return the profissao
     */
    public Profissao getProfissao() {
        return profissao;
    }

    /**
     * @param profissao the profissao to set
     */
    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
