/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calendario;

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
        int n = 1;
        String str_n;

        while (n != 0)
        {

            //Entrada
            str_n = c.readLine("\nDigite o numero do mes (digite 0 para sair):  ");

            //Conversão

            n = Integer.parseInt(str_n);

             switch(n)
        {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Desembro");
            case 0:
                break;
            default:
                System.out.println("\nNumero Invalido");
                break;
        }
        }
    }

}
