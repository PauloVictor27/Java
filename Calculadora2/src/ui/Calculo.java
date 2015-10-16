/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import conceitual.Calculadora;
import conceitual.Divisaozero;
import conceitual.QuadradoException;
import conceitual.RaizExeption;
import java.util.Scanner;

/**
 *
 * @author UDESC
 */
public class Calculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        int n1 = 1, n2 = 1;
        System.out.println("Digite o 1 numero: ");
        n1 = s.nextInt();
        System.out.println("Digite o 2 numero: ");
        n2 = s.nextInt();
        System.out.println("Soma: "+calculadora.soma(n1, n2));
        System.out.println("Subitracao: "+calculadora.subitrai(n1, n2));
        System.out.println("Multiplicao: "+calculadora.multiplica(n1, n2));
        try {
            System.out.println("Divisao: "+calculadora.divisao(n1, n2));
        } catch (Divisaozero e) {
            System.out.println("Operacao invalida");
        }
        try {
            System.out.println("Quadrado de n1: "+calculadora.quadrado(n1));
        } catch (QuadradoException e) {
            System.out.println("Operacao invalida");
        }
        try {
            System.out.println("Quadrado de n2: "+calculadora.quadrado(n2));
        } catch (QuadradoException e) {
            System.out.println("Operacao invalida");
        }
        try {
            System.out.println("Raiz de n1: "+calculadora.raiz(n1));
        } catch (RaizExeption e) {
            System.out.println("Operacao invalida");
        }
        try {
            System.out.println("Raiz de n1: "+calculadora.raiz(n2));
        } catch (RaizExeption e) {
            System.out.println("Operacao invalida");
        }
    }

}
