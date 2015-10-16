/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eleitores;

import java.io.Console;

/**
 *
 * @author UDESC
 */
public class PrincipalEleitores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicialização do consoler
        Console c;
        c = System.console();
        if (c == null)
        {
            System.out.println("Vc precisa estar no prompt!");
            System.exit(1);
        }

        //Variaveis
        int n = 0, i, idade, opicional = 0, obrigatorio = 0, n_votam = 0;

        //Entrada
        n = Integer.parseInt(c.readLine("\nQuantos pessoas?\n"));
        for(i = 0; i < n; i++)
        {
            idade = Integer.parseInt(c.readLine("Informe a idade ("+(i+1)+")\n"));
            if (idade < 16)
            {
                n_votam += 1;
            }

            else if ((idade >= 16)&&(idade < 18))
            {
                opicional += 1;
            }

            else
            {
                obrigatorio += 1;
            }
        }

        //Saida
        System.out.println("\nNao votantes: "+n_votam);
        System.out.println("Opicionais: "+opicional);
        System.out.println("Nao votantes: "+obrigatorio);
    }

}
