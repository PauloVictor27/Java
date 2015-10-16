/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio7;

import java.io.Console;

/**
 *
 * @author PauloVitor
 */
public class Exercicio7 {

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
        float time_a[] = new float[5];
        float time_b[] = new float[5];
        int i;
        float menor_a = 1000, maior_a = 0, menor_b = 1000, maior_b = 0, media_a = 0, media_b = 0;
        
        //Entrada
        for(i = 0; i < 5; i++)
        {
            time_a[i] = Float.parseFloat(c.readLine("\nInforme a altura ("+(i+1)+") do time a: "));

            if (time_a[i] < menor_a)
            {
                menor_a = time_a[i];
            }

            if (time_a[i] > maior_a)
            {
                maior_a = time_a[i];
            }

            media_a += time_a[i];
        }
        media_a = media_a/5;
        
        for(i = 0; i < 5; i++)
        {
            time_b[i] = Float.parseFloat(c.readLine("\nInforme a altura ("+(i+1)+") do time b: "));

            if (time_b[i] < menor_b)
            {
                menor_b = time_b[i];
            }

            if (time_b[i] > maior_b)
            {
                maior_b = time_b[i];
            }

            media_b += time_b[i];
        }
        media_b = media_b/5;

        //Saida
        System.out.println("A menor do time a eh: "+menor_a);
        System.out.println("A maior do time a eh: "+maior_a);
        System.out.println("A media do time a eh: "+media_a);
        System.out.println("A menor do time b eh: "+menor_b);
        System.out.println("A maior do time b eh: "+maior_b);
        System.out.println("A media do time b eh: "+media_b);
        
    }
    
}
