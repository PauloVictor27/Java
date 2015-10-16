/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mediasalarial;

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
        //Inicialização do consoler
        Console c;
        c = System.console();

        //Variaveis
        String strsalario1;
        String strsalario2;
        String strsalario3;
        String strsalario4;
        String strsalario5;
        float media;

        //Entrada
        strsalario1 = c.readLine("\nDigite o salario1: ");
        strsalario2 = c.readLine("Digite o salario2: ");
        strsalario3 = c.readLine("Digite o salario3: ");
        strsalario4 = c.readLine("Digite o salario4: ");
        strsalario5 = c.readLine("Digite o salario5: ");

        //Conversão
        float salario1;
        float salario2;
        float salario3;
        float salario4;
        float salario5;

        salario1 = Float.parseFloat(strsalario1);
        salario2 = Float.parseFloat(strsalario2);
        salario3 = Float.parseFloat(strsalario3);
        salario4 = Float.parseFloat(strsalario4);
        salario5 = Float.parseFloat(strsalario5);

        //Calculo da media
        media = (salario1 + salario2 + salario3 + salario4 +salario5)/5;

        //Saida
        System.out.println("\nSalario1: "+salario1);
        System.out.println("Salario2: "+salario2);
        System.out.println("Salario3: "+salario3);
        System.out.println("Salario4: "+salario4);
        System.out.println("Salario5: "+salario5);
        System.out.println("\nMedia: "+media);
    }

}
