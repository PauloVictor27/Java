/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conceitual;

/**
 *
 * @author UDESC
 */
public class Divisaozero extends Exception {

    /**
     * Creates a new instance of <code>Divisaozero</code> without detail message.
     */
    public Divisaozero() {
    }


    /**
     * Constructs an instance of <code>Divisaozero</code> with the specified detail message.
     * @param msg the detail message.
     */
    public Divisaozero(String msg) {
        super(msg);
    }
}
