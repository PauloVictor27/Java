/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conceitual;

/**
 *
 * @author Wesley
 */
public class Curso {
private int cod;
    private Coordenador coordenador;

public Curso(Coordenador coordenador){
    this.coordenador = coordenador;
}

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    /**
     * @return the coordenador
     */
    public Coordenador getCoordenador() {
        return coordenador;
    }

    /**
     * @param coordenador the coordenador to set
     */
    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }
}
