/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package parouimpar;

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
        Console c;
        c = System.console();

        //Variaveis
        int n = 1;
        int x = 0;
        String str_n;

        while (n != 0)
        {
            //Entrada
            str_n = c.readLine("\nDigite um numero (digite 0 para sair):  ");

            //Conversão

            n = Integer.parseInt(str_n);

            x = n%2;


             switch(x)
             {
                 case 0:
                     System.out.println("Par");
                     break;
                 case 1:
                     System.out.println("Impar");
                   break;
                 default:
                   break;
             }
        }
    }

}
