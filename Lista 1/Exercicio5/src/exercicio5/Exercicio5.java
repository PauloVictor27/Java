/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio5;

import java.io.Console;

/**
 *
 * @author PauloVitor
 */
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Iniciar Consoler
        Console c;
        c = System.console();
        
        //Variaveis
        int i, n_1, n_2;
        float x;
        
        //Entrada
        n_1 = Integer.parseInt(c.readLine("Informe um numero\n"));
        n_2 = Integer.parseInt(c.readLine("Informe seu divisor\n"));
        
        //Processo
        x = n_1% n_2;
        
        if (x != 0)
        {
            System.out.println("\n"+(n_1)+" nao eh divisivel por "+(n_2)+"");
        }
        else
        {
            System.out.println("\n"+(n_1)+" eh divisivel por "+(n_2)+"");
        }
    }
    
}
