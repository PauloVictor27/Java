/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve os atributos da nota
 * @author UDESC
 */
public class Nota {
private int nota;
private Aluno aluno;
private Disciplina disciplina;


    /**
     * Obtem a nota
     * @return the nota
     */
    public int getNota() {
        return nota;
    }

    /**
     * Configura a nota
     * @param nota the nota to set
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * Obtem o aluno da nota
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * Configura o aluno da nota
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * Obtem a disciplina da nota
     * @return the disciplina
     */
    public Disciplina getDisciplina() {
        return disciplina;
    }

    /**
     * Configura a disciplina da nota
     * @param disciplina the disciplina to set
     */
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
