/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio8;

import java.io.Console;

/**
 *
 * @author PauloVitor
 */
public class Exercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Iniciar consoler
        Console c;
        c = System.console();
        if (c == null)
        {
            System.out.println("Vc precisa estar no prompt!");
            System.exit(1);
        }
        
        //Variaveis
        int vetor_a[] = new int[8];
        int vetor_b[] = new int[8];
        int vetor_c[] = new int[8];
        int i;
        
        
        //Entrada
        for (i = 0; i < 8; i++)
        {
            vetor_a[i] = Integer.parseInt(c.readLine("Digite o "+(i+1)+" temro de a: "));
        }
        
        for (i = 0; i < 8; i++)
        {
            vetor_b[i] = Integer.parseInt(c.readLine("Digite o "+(i+1)+" temro de b: "));
        }
        
        for (i = 0; i < 8; i++)
        {
            if(i%2 == 0)
            {
                vetor_c[i] = vetor_a[i] + vetor_b[i];
            }
            else
            {
                vetor_c[i] = vetor_a[i]*vetor_b[i];
            }  
        }
        
        for (i = 0; i < 8; i++)
        {
            System.out.println("c["+(i+1)+"]: "+vetor_c[i]);
        }
    }
    
}
