/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploscanner;

import java.util.Scanner;

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
        Scanner s = new Scanner(System.in);
        int idade = s.nextInt();
        float salario = s.nextFloat();
        String linha = s.nextLine();
        String palavra = s.next();
    }
}
