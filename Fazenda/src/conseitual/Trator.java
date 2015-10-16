/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 *
 * @author UDESC
 */
public class Trator {
    private int potencia;
    private int capacidade;
    private Comida coleta;

    //Decla a colteta do trator
    public Trator(){
        coleta = new Comida() {};
    }
    /**
     * Obtem a potencia
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * Configura a potencia
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * Obtem a capacidade
     * @return the capacidade
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Configura a capacidade
     * @param capacidade the capacidade to set
     */
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Obtem a coleta
     * @return the coleta
     */
    public Comida getColeta() {
        return coleta;
    }

    /**
     * Configura a coleta
     * @param coleta the coleta to set
     */
    public void setColeta(Comida coleta) {
        this.coleta = coleta;
    }
}
