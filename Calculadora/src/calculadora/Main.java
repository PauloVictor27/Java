/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculadora;

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
        //Incio
        Console c = System.console();
        if(c == null)
        {
            System.out.println("É necessario o prompt");
            System.exit(1);
        }

        Adicao a = new Adicao();
        Subtracao s = new Subtracao();
        Multiplicacao m = new Multiplicacao();
        Divisao d = new Divisao();

        //Variaveis
        int numero1;
        int numero2;

        //Entrada
        numero1 = Integer.parseInt(c.readLine("Digite o primeiro numero: "));
        numero2 = Integer.parseInt(c.readLine("Digite o segundo numero: "));

        //Construção dos Objetos
        a.setN1(numero1);
        a.setN2(numero2);
        s.setN1(numero1);
        s.setN2(numero2);
        m.setN1(numero1);
        m.setN2(numero2);
        d.setN1(numero1);
        d.setN2(numero2);

        //Saida
        a.operação(a.getN1(), a.getN2());
        s.operação(a.getN1(), a.getN2());
        m.operação(a.getN1(), a.getN2());
        d.operação(a.getN1(), a.getN2());
    }

}
