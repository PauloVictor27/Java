/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio2;

import java.io.Console;

/**
 *
 * @author PauloVitor
 */
public class Exercicio2 {

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
        int menor = 99999;
        float media = 0;
        
        //Entrada
        for(i = 0; i < 5; i++)
        {
            vetor[i] = Integer.parseInt(c.readLine("Digite o salario: "));
            if (vetor[i] > maior)
            {
                maior = vetor[i];
            }
            
            if (vetor[i] < menor)
            {
                menor = vetor[i];
            }
            media += vetor[i];
        }        
        media = media/5;
        
        //Saida
        System.out.println("\nMaior salario: "+maior);
        System.out.println("Menor salario: "+menor);
        System.out.println("Media "+media);
    }
    
}
