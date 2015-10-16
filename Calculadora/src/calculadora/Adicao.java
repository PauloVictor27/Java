/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

/**
 *
 * @author UDESC
 */
public class Adicao extends Calculadora {

    @Override
    public void operação(int a, int b) {
        System.out.println(""+a+" + "+b+" = "+(a + b));
    }


}
