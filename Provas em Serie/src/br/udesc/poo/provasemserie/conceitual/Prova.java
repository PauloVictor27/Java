/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.udesc.poo.provasemserie.conceitual;

import java.io.Serializable;

/**
 *
 * @author UDESC
 */
public class Prova implements Serializable{
    private String aluno;
    private String turma;
    private int nota;
    private Disciplinas disciplina;

    public Prova() {
    }

    public Prova(String aluno, String turma, int nota, Disciplinas disciplina) {
        this.aluno = aluno;
        this.turma = turma;
        this.nota = nota;
        this.disciplina = disciplina;
    }

    
    /**
     * @return the aluno
     */
    public String getAluno() {
        return aluno;
    }

    /**
     * @param aluno the aluno to set
     */
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    /**
     * @return the turma
     */
    public String getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    /**
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * @return the disciplina
     */
    public Disciplinas getDisciplina() {
        return disciplina;
    }

    /**
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(Disciplinas disciplina) {
        this.disciplina = disciplina;
    }

    public void setDisciplina(int disciplina) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
