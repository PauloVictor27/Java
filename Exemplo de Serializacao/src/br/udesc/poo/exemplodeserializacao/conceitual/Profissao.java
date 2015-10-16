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
public class Profissao implements Serializable{
    private String nome;

    public Profissao(String nome) {
        this.nome = nome;
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
}
