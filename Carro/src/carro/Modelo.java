/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package carro;

/**
 *
 * @author PauloVitor
 */
public class Modelo extends Carro
{
    @Override
    public void registro(String dado)
    {
        System.out.println("Modelo: "+dado);
    }
}
