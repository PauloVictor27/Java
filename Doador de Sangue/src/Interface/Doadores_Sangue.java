/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Conseitual.Doador;
import java.io.Console;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author UDESC
 */
public class Doadores_Sangue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicio
        Doador d = new Doador();
        Console c = System.console();
        if(c == null)
        {
            System.out.println("É necessario o prompt");
            System.exit(1);
        }

        //Variaveis
        String nome;
        String sexo;
        String tipo_sanguineo;
        int peso;
        int idade;

        //Entrada
        nome = c.readLine("Qual o nome: ");
        sexo = c.readLine("Qual o sexo: ");
        tipo_sanguineo = c.readLine("Qual o tipo sanguineo: ");
        peso = Integer.parseInt(c.readLine("Qual o peso: "));
        idade = Integer.parseInt(c.readLine("Qual o idade: "));

        //Configuração do Objeto
        d.setNome(nome);
        d.setSexo(sexo);
        d.setTipo_sanguineo(tipo_sanguineo);
        d.setPeso(peso);
        d.setIdade(idade);

        //Saida
        System.out.println("");
        System.out.println("__________________________");
        System.out.println("Todos os dados foram lidos");
        System.out.println("__________________________");
        System.out.println("");
        System.out.println("Nome: "+d.getNome());
        System.out.println("Sexo: "+d.getSexo());
        System.out.println("Tipo sanguineo: "+d.getTipo_sanguineo());
        System.out.println("Peso: "+d.getPeso());
        System.out.println("Idade: "+d.getIdade());
        System.out.println("");
        if(peso > 50)
        {
            System.out.println("Eh doador");
        }
        else
        {
            System.out.println("Nao eh doador");
        }
    }
}
