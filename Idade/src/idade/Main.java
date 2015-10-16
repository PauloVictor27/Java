/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package idade;

/**
 *
 * @author UDESC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variaveis
        int nascimento = 1994;
        int ano = 2014;
        int idade;

        //Operação
        idade = ano - nascimento;

        //Saida
        System.out.println("Sua idade é: "+idade);
    }

}
