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
        ListaSimples<Integer> lista = new ListaSimples<Integer>();

        lista.adicionaNoFim(1);
        lista.adicionaNoFim(2);
        lista.adicionaNoFim(3);
        lista.adicionaNoInicio(0);
        lista.mostrarLista();
        System.out.println("");
        System.out.println("Removido item do final: " + lista.removeNoFim().toString());
        System.out.println("Removido item do final: " + lista.removeNoFim().toString());
        lista.mostrarLista();
        System.out.println("");
        System.out.println("Removido item do inicio: " + lista.removeNoInicio().toString());
        lista.mostrarLista();

    }

}
