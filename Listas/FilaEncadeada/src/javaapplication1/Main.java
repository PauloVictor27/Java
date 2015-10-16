/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

/**
 *
 * @author UDESC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FilaEncadeada<Integer> lista = new FilaEncadeada<Integer>();

        lista.adiciona(1);
        lista.adiciona(2);
        lista.adiciona(3);
        lista.mostrarFila();
        System.out.println("");
        lista.remove();
        lista.mostrarFila();

    }

}
