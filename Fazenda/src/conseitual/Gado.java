/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve os atributos do gado
 * @author UDESC
 */
public class Gado extends Animais{
    private int nVacas;
    private Vaca vaca;

    //Declaro a vaca no gado
    public Gado(){
        vaca = new Vaca();
    }

    /**
     * Obtem o numero de vacas
     * @return the nVacas
     */
    public int getnVacas() {
        return nVacas;
    }

    /**
     * Configura o numero de vacas
     * @param nVacas the nVacas to set
     */
    public void setnVacas(int nVacas) {
        this.nVacas = nVacas;
    }

    /**
     * Obtem a vaca
     * @return the vaca
     */
    public Vaca getVaca() {
        return vaca;
    }

    /**
     * Configura a vaca
     * @param vaca the vaca to set
     */
    public void setVaca(Vaca vaca) {
        this.vaca = vaca;
    }
}
