/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conceitual;

/**
 *
 * @author UDESC
 */
public class QuadradoException extends Exception {

    /**
     * Creates a new instance of <code>QuadradoException</code> without detail message.
     */
    public QuadradoException() {
    }


    /**
     * Constructs an instance of <code>QuadradoException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public QuadradoException(String msg) {
        super(msg);
    }
}
