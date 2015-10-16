/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import conceitual.DeMenorExeption;
import conceitual.Pessoas;

/**
 *
 * @author UDESC
 */
public class PricipalExecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoas p = new Pessoas();
        p.setNome("Pv");
        try {
            p.setIdade(20);
        } catch (DeMenorExeption e) {
            System.out.println("Idade do minimo permitido");
        }
        p.setGenero("masc");
    }
}
