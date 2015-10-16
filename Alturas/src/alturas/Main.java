/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alturas;

import java.io.Console;

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

        //Iniciar consoler
        Console c;
        c = System.console();
        if (c == null)
        {
            System.out.println("Vc precisa estar no prompt!");
            System.exit(1);
        }

        //Variaveis
        int n = 0, i;
        float altura, menor = 1000, maior = 0, media = 0;

        //Entrada
        n = Integer.parseInt(c.readLine("Quantos alunos?\n"));
        for(i = 0; i < n; i++)
        {
            altura = Float.parseFloat(c.readLine("\nInforme a altura ("+(i+1)+"): "));

            if (altura < menor)
            {
                menor = altura;
            }

            if (altura > maior)
            {
                maior = altura;
            }

            media += altura;
        }
        media = media/n;

        //Saida
        System.out.println("A menor eh: "+menor);
        System.out.println("A maior eh: "+maior);
        System.out.println("A media eh: "+media);
    }
}
