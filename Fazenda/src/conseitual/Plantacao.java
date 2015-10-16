/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 * Classe que descreve os atributos da plantacao
 * @author PauloVitor
 */
public class Plantacao {
    private int nComidas;
    private Comida comida;
    private Adubo adubo;
    private Trator trator;

    //Declara os componentes da plantacao
    public Plantacao(){
        adubo = new Adubo();
        trator = new Trator();
        comida = new Comida() {};
    }

    /**
     * Obtem a quantidade de comidas
     * @return the nComidas
     */
    public int getnComidas() {
        return nComidas;
    }

    /**
     * Configura a quantidade de comidas
     * @param nComidas the nComidas to set
     */
    public void setnComidas(int nComidas) {
        this.nComidas = nComidas;
    }

    /**
     * Obtem a comida
     * @return the comida
     */
    public Comida getComida() {
        return comida;
    }

    /**
     * Configura a comida
     * @param comida the comida to set
     */
    public void setComida(Comida comida) {
        this.comida = comida;
    }

    /**
     * Obtem o adubo
     * @return the adubo
     */
    public Adubo getAdubo() {
        return adubo;
    }

    /**
     * Configura o adubo
     * @param adubo the adubo to set
     */
    public void setAdubo(Adubo adubo) {
        this.adubo = adubo;
    }

    /**
     * Obtem o trator
     * @return the trator
     */
    public Trator getTrator() {
        return trator;
    }

    /**
     * Configura o trator
     * @param trator the trator to set
     */
    public void setTrator(Trator trator) {
        this.trator = trator;
    }

}
