/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conceitual;

/**
 *
 * @author UDESC
 */
public class DeMenorExeption extends Exception {

    /**
     * Creates a new instance of <code>DeMenorExeption</code> without detail message.
     */
    public DeMenorExeption() {
    }


    /**
     * Constructs an instance of <code>DeMenorExeption</code> with the specified detail message.
     * @param msg the detail message.
     */
    public DeMenorExeption(String msg) {
        super(msg);
    }
}
