/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio4;

import java.io.Console;

/**
 *
 * @author PauloVitor
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Iniciar Consoler
        Console c;
        c = System.console();
        
        //Variaveis
        int i, n, cont = 0;
        
        //Entrada
        n = Integer.parseInt(c.readLine("Informe um numero\n"));
        
        for (i = 2; i < n; i++)
        {
            if (n%i == 0)
            {
                cont += 1;
            }
        }
        
        if (cont != 0)
        {
            System.out.println("Nao eh numero primo");
        }
        else
        {
            System.out.println("Eh numero primo");
        }
    }
}
