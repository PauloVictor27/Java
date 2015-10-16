/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package votosswitch;

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
        //Iniciar Consoler
        Console c;
        c = System.console();

        //Variaveis
        int n = 0, amin = 0, luiz_henrique = 0, branco = 0, nulo = 0;
        String str_n;

        do
        {

        //Entrada
        str_n = c.readLine("\nDigite a opção\n(1) para votar no Amin, (2) para votar no Luiz Henrique, (3) para votar em Branco, (4) para voto Nulo, (5) para Sair:  ");

        //Conversão
        
        n = Integer.parseInt(str_n);

        //Contagem
        switch(n)
        {
            case 1:
                amin += 1;
                break;
            case 2:
                luiz_henrique += 1;
                break;
            case 3:
                branco += 1;
                break;
            case 4:
                nulo += 1;
                break;
            case 5:
                break;
            default:
                System.out.println("\nNumero Invalido");
                break;
        }
        } while(n != 5);

        //Saida
        System.out.println("\nResultados:");
        System.out.println("Amin: "+amin);
        System.out.println("Luiz Henrique: "+luiz_henrique);
        System.out.println("Votos em Branco: "+branco);
        System.out.println("Votos Nulos: "+nulo);
        
    }

}
