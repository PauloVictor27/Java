/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conceitual;

/**
 *
 * @author UDESC
 */
public class RaizExeption extends Exception {

    /**
     * Creates a new instance of <code>RaizExeption</code> without detail message.
     */
    public RaizExeption() {
    }


    /**
     * Constructs an instance of <code>RaizExeption</code> with the specified detail message.
     * @param msg the detail message.
     */
    public RaizExeption(String msg) {
        super(msg);
    }
}
