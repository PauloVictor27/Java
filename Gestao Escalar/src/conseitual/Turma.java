/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve os atributos da turma
 * @author UDESC
 */
public class Turma {
    private int nAlunos;
    private Aluno aluno;
    private Curso curso;

    /**
     * Obtem o nunero de alunos da turma
     * @return the nAlunos
     */
    public int getnAlunos() {
        return nAlunos;
    }

    /**
     * Configura o nunero de alunos da turma
     * @param nAlunos the nAlunos to set
     */
    public void setnAlunos(int nAlunos) {
        this.nAlunos = nAlunos;
    }

    /**
     * Obtem o aluno da turma
     * @return the aluno
     */
    public Aluno getAluno() {
        return aluno;
    }

    /**
     * Configura o aluno da turma
     * @param aluno the aluno to set
     */
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    /**
     * Obtem o curso da turma
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Configura o curso da turma
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
