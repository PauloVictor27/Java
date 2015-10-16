/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package funcionario;

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
        String str_nome;
        String str_idade;
        String str_telefone;
        String str_salario;
        String str_sexo;

        double imposto;
        int alimentacao = 100;
        double salario_liquido;

        //Entrada
        str_nome = c.readLine("\nDigite o nome: ");
        str_idade = c.readLine("Digite a idade: ");
        str_telefone = c.readLine("Digite o telefone: ");
        str_salario = c.readLine("Digite o salario: ");
        str_sexo = c.readLine("Digite o sexo: ");

        //Conversão
        int idade;
        long telefone;
        float salario;

        idade = Integer.parseInt(str_idade);
        telefone = Long.parseLong(str_telefone);
        salario = Float.parseFloat(str_salario);

        //Calculo
        imposto = salario*0.02;
        salario_liquido = salario - imposto + alimentacao;

        //Saida
        System.out.println("\nNome: "+str_nome);
        System.out.println("Idade: "+idade);
        System.out.println("Telefone: "+telefone);
        System.out.println("Salario: "+salario);
        System.out.println("Sexo: "+str_sexo);
        System.out.println("\nSalario Liquido: "+salario_liquido);

    }

}
