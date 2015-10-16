/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author UDESC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Variaveis

        Vector<String> nomes = new Vector();
        String nome;
        int i, b;

        //Entrada

        for (i = 0; i < 10; i++) {
            System.out.println("Digite o nome " + (i + 1) + ":");
            nome = s.next();
            nomes.add(nome);
        }
        nomes.remove(7);

        nomes.setElementAt("quinto", 4);
        //Saida

        System.out.println("\nPrimeiro nome: " + nomes.firstElement());
        System.out.println("\nUltimo nome: " + nomes.lastElement());
        System.out.println("\nTerceiro nome: " + nomes.get(2));
        System.out.println("\nOitavo nome: " + nomes.get(7));
        System.out.println("\nQuinto nome: " + nomes.get(4));

        System.out.println("\nDigite a posicao do nome que queira ver: ");
        b = s.nextInt();
        System.out.println("\nNome buscado: " + nomes.get(b - 1));
    }
}
