/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Conseitual.Pessoa;
import java.io.Console;

/**
 *
 * @author UDESC
 */
public class Agenda_Aniversario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicio
        Pessoa p = new Pessoa();
        Console c = System.console();
        if(c == null)
        {
            System.out.println("É necessario o prompt");
            System.exit(1);
        }

        //Variaveis
        String nome;
        String telefone;
        int dia, mes;

        //Entrada
        nome = c.readLine("Qual o nome: ");
        telefone = c.readLine("Qual o telefone: ");
        dia = Integer.parseInt(c.readLine("Qual o dia: "));
        mes = Integer.parseInt(c.readLine("Qual o mes: "));

        //Configuração do Objeto
        p.setNome(nome);
        p.setDia(dia);
        p.setMes(mes);
        p.setTelefone(telefone);

        //Saida
        System.out.println("");
        System.out.println("__________________________");
        System.out.println("Todos os dados foram lidos");
        System.out.println("__________________________");
        System.out.println("");
        System.out.println("Nome: "+p.getNome());
        System.out.println("Telefone: "+p.getTelefone());
        System.out.println("Dia: "+p.getDia());
        System.out.println("Mes: "+p.getMes());
    }

}
