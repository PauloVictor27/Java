/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import conceitual.Fila;
import conceitual.Pessoa;
import java.util.Scanner;

/**
 *
 * @author UDESC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Fila fila = new Fila();
        int op;
        do {
            System.out.println("Digite a operacao [1 empilha, 2 desempilha, 3 topo, 0 sai]:");
            op = s.nextInt();
            s.nextLine();
            switch (op) {
                case 1:
                    Pessoa p = new Pessoa();
                    System.out.println("Digite o nome: ");
                    p.setNome(s.nextLine());
                    System.out.println("Digite a idade: ");
                    p.setIdade(s.nextInt());
                    s.nextLine();
                    fila.emfilerar(p);
                    break;
                case 2:
                    p = new Pessoa();
                    p = fila.desemfilerar();
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("Idade: " + p.getIdade());
                    break;
                case 3:
                    p = new Pessoa();
                    p = fila.cabeca();
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("Idade: " + p.getIdade());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nNumero Invalido");
                    break;
            }
        } while (op != 0);
    }
}
