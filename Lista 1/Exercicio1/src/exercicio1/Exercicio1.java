/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio1;

import java.io.Console;

/**
 *
 * @author PauloVitor
 */
public class Exercicio1 {

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
        int vetor[] = new int[5];
        int i;
        int maior = 0;
        int posicao = 0;
        
        //Entrada
        for(i = 0; i < 5; i++)
        {
            vetor[i] = Integer.parseInt(c.readLine("Digite a Idade: "));
            if (vetor[i] > maior)
            {
                maior = vetor[i];
                posicao = i + 1;
            }
        }
        
        //Saida
        System.out.println("\nMaior idade "+maior);
        System.out.println("Posicao: "+posicao);
    }
    
}
