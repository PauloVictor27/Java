/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testedeconsoler;

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

        String nome = c.readLine("\nDigite seu nome: ");
        String strSalario;
        String strIdade;

        strSalario = c.readLine("Digite salario: ");
        strIdade = c.readLine("Digite idade: ");

        //converter
        float salario;
        int idade;

        salario = Float.parseFloat(strSalario);
        idade = Integer.parseInt(strIdade);

        String senha;
        senha = new String(c.readPassword("Qual a senha?"));

        System.out.println("\nNome: " + nome);
        System.out.println("Salario: " + strSalario);
        System.out.println("Idade: " + strIdade);
        System.out.println("Senha: " + senha);
    }
}
