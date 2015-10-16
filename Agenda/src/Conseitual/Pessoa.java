/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Conseitual;

/**
 * Classe de pessoa modela o conceito de pessoa
 * escopo de agenda
 * @author Pv
 */
public class Pessoa {
    private int dia;
    private int mes;
    private String telefone;
    private String nome;

    /**
     * Obtem o dia do aniversario
     * @return the dia
     */
    public int getDia() {
        return dia;
    }

    /**
     * Configura o dia
     * @param dia the dia to set
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public int getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(int mes) {
        this.mes = mes;
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
