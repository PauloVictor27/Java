/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfac;

import conseitual.Carro;
import conseitual.Montadora;
import conseitual.Motor;
import conseitual.MotorFlex;

/**
 *
 * @author UDESC
 */
public class MontarCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Motor motor = null;
        Montadora montadora = new Montadora();
        //
        motor = new MotorFlex();
        //
        Carro carro = new Carro(motor);
    }

}
