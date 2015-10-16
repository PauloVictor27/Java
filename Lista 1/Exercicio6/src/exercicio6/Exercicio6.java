/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio6;

import java.io.Console;

/**
 *
 * @author PauloVitor
 */
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicialização do consoler
        Console c;
        c = System.console();
        
        //Variaveis
        int masculino [] = new int [5];
        masculino[4] = 0;
        int feminino [] = new int [5];
        feminino[4] = 0;
        int i = 0, j = 0,k = 0, maior_m = 0, menor_m = 1000, maior_f = 0, menor_f = 1000;
        int maior = 0, menor = 1000;
        int sexo;
        
        //Entrada
        while (i < 10)
        {
            sexo = Integer.parseInt(c.readLine("\nInforme o sexo (1 para masculino e 2 para feminino)\n"));
            
            switch (sexo)
            {
                case 1:
                {
                    if(masculino[4] == 0)
                    {
                        masculino[j] = Integer.parseInt(c.readLine("Informe a idade\n"));
                        
                        if (masculino[j] < menor_m)
                        {
                            menor_m = masculino[j];
                        }

                        if (masculino[j] > maior_m)
                        {
                            maior_m = masculino[j];
                        }
                        
                        j++;
                        i++;
                    }
                    else
                    {
                        System.out.println("Turma cheia\n");
                    }
                    break;
                }
                
                case 2:
                {
                    if(feminino[4] == 0)
                    {
                        feminino[k] = Integer.parseInt(c.readLine("Informe a idade\n"));
                        
                        if (feminino[k] < menor_f)
                        {
                            menor_f = feminino[k];
                        }

                        if (feminino[k] > maior_f)
                        {
                            maior_f = feminino[k];
                        }
                        
                        k++;
                        i++;
                    }
                    else
                    {
                        System.out.println("Turma cheia\n");
                    }
                    break;
                }
                default:
                {
                    System.out.println("Numero invalido\n");
                    break;
                }
            }
            
        }
        if(menor_m < menor_f)
        {
            menor = menor_m; 
        }
        else
        {
            menor = menor_f;
        }
        
        if(maior_m > maior_f)
        {
            maior = maior_m; 
        }
        else
        {
            maior = maior_f;
        }
        
        //Saida
        System.out.println("\nA menor eh: "+menor);
        System.out.println("A maior eh: "+maior);
    }
}
