/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 *
 * @author UDESC
 */
public class Carro {
    private int anoFabricacao;
    private String cor;

    private Roda rodas[];
    private Montadora montadora;
    private Motor motor;

    public Carro(Motor motor){
        rodas = new Roda[4];
        rodas[0] = new Roda();
        rodas[1] = new Roda();
        rodas[2] = new Roda();
        rodas[3] = new Roda();

        this.motor = motor;
    }

    /**
     * @return the anoFabricacao
     */
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    /**
     * @param anoFabricacao the anoFabricacao to set
     */
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the rodas
     */
    public Roda[] getRodas() {
        return rodas;
    }

    /**
     * @param rodas the rodas to set
     */
    public void setRodas(Roda[] rodas) {
        this.rodas = rodas;
    }

    /**
     * @return the montadora
     */
    public Montadora getMontadora() {
        return montadora;
    }

    /**
     * @param montadora the montadora to set
     */
    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    /**
     * @return the motor
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
