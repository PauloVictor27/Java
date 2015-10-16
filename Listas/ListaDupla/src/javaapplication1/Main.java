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
        ListaDuplamenteEncadeadaGenericaCircular<Integer> lista = new ListaDuplamenteEncadeadaGenericaCircular<Integer>();

        lista.AdicionaNoFim(1);
        lista.AdicionaNoFim(2);
        lista.AdicionaNoFim(3);
        lista.mostrarLista();
        System.out.println("");
        lista.removeNoInicio();
        lista.removeNoFim();
        lista.mostrarLista();

    }

}
