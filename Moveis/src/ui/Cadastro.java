/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import conseitual.Cadeira;
import conseitual.Cama;
import conseitual.Mesa;
import conseitual.Sofa;

/**
 *
 * @author PauloVitor
 */
public class Cadastro {

    static final int MAX_MOVEIS = 4;
    public static int nMoveis = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cadeira cad1 = new Cadeira();
        if (nMoveis > MAX_MOVEIS) {
            System.out.println("Extendeu o limite!: " + nMoveis);
        } else {
            System.out.println("Movel cadastrado com sucesso: " + nMoveis);
        }

        Cama cam1 = new Cama();
        if (nMoveis > MAX_MOVEIS) {
            System.out.println("Extendeu o limite!: " + nMoveis);
        } else {
            System.out.println("Movel cadastrado com sucesso: " + nMoveis);
        }

        Mesa mes1 = new Mesa();
        if (nMoveis > MAX_MOVEIS) {
            System.out.println("Extendeu o limite!: " + nMoveis);
        } else {
            System.out.println("Movel cadastrado com sucesso: " + nMoveis);
        }

        Sofa sof1 = new Sofa();
        if (nMoveis > MAX_MOVEIS) {
            System.out.println("Extendeu o limite!: " + nMoveis);
        } else {
            System.out.println("Movel cadastrado com sucesso: " + nMoveis);
        }

        Sofa sof2 = new Sofa();
        if (nMoveis > MAX_MOVEIS) {
            System.out.println("Extendeu o limite!: " + nMoveis);
        } else {
            System.out.println("Movel cadastrado com sucesso: " + nMoveis);
        }
    }
}
