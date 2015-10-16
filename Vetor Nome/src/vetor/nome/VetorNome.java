/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vetor.nome;

import java.io.Console;
import java.util.Vector;

/**
 *
 * @author PauloVitor
 */
public class VetorNome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicio
        Console c;
        c = System.console();
        if (c == null)
        {
            System.out.println("Vc precisa estar no prompt!");
            System.exit(1);
        }
        
        //Variaveis
        Vector <String> nomes = new Vector();
        String nome;
        int i;

        //Entrada
        for (i = 0; i < 10; i++)
        {
            nome = c.readLine("\nDigite "+(i+1)+" nome: ");
            nomes.add(nome);
        }

        //Saida
        System.out.println("\nPrimeiro nome: "+nomes.firstElement());
        System.out.println("\nUltimo nome: "+nomes.lastElement());
        
    }
    
}
