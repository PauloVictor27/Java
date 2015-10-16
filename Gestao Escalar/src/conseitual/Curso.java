/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve os atributos do curso
 * @author UDESC
 */
public class Curso {
private String nomeCurso;
private Coodenador coodenador;

    /**
     * Obtem o nome do curso
     * @return the nomeCurso
     */
    public String getNomeCurso() {
        return nomeCurso;
    }

    /**
     * Configura o nome do curso
     * @param nomeCurso the nomeCurso to set
     */
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

   

    /**
     * Obtem o coodenador do curso
     * @return the coodenador
     */
    public Coodenador getCoodenador() {
        return coodenador;
    }

    /**
     * Configura o coodenador do curso
     * @param coodenador the coodenador to set
     */
    public void setCoodenador(Coodenador coodenador) {
        this.coodenador = coodenador;
    }
}
