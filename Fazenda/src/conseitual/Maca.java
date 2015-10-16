/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve o numero de macas
 * @author UDESC
 */
public class Maca extends Comida{
    private int nMaca;

    /**
     * Obtem o numero de macas
     * @return the nMaca
     */
    public int getnMaca() {
        return nMaca;
    }

    /**
     * Configura o numero de macas
     * @param nMaca the nMaca to set
     */
    public void setnMaca(int nMaca) {
        this.nMaca = nMaca;
    }
}
