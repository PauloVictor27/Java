/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve os atributos da disciplina
 * @author UDESC
 */
public class Disciplina {
private String nomeDisciplina;
private Curso curso;
private Professor professor;

//Configura o curso e o professor da disciplina
public Disciplina(){
    curso = new Curso();
}

    /**
     * Obtem o nome da disciplina
     * @return the nomeDisciplina
     */
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    /**
     * Configura o nome da disciplina
     * @param nomeDisciplina the nomeDisciplina to set
     */
    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    

    /**
     * Obtem o professor da disciplina
     * @return the professor
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * Configura o professor da disciplina
     * @param professor the professor to set
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * Obtem o curso da disciplina
     * @return the curso
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Configura o curso da disciplina
     * @param curso the curso to set
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
