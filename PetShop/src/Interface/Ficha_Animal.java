/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Conseitual.Animal;
import java.io.Console;

/**
 *
 * @author UDESC
 */
public class Ficha_Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicio
        Animal a = new Animal();
        Console c = System.console();
        if(c == null)
        {
            System.out.println("É necessario o prompt");
            System.exit(1);
        }

        //Variaveis
        String animal_tipo;
        String raca;
        String sexo;
        String pelagem;
        int tamanho;
        int peso;

        //Entrada
        animal_tipo = c.readLine("Qual o animal: ");
        raca = c.readLine("Qual a raca: ");
        sexo = c.readLine("Qual o sexo: ");
        pelagem = c.readLine("Qual a pelagem: ");
        tamanho = Integer.parseInt(c.readLine("Qual o tamanho: "));
        peso = Integer.parseInt(c.readLine("Qual o peso: "));

        //Configuração do Objeto
        a.setAnimal_tipo(animal_tipo);
        a.setRaca(raca);
        a.setSexo(sexo);
        a.setPelagem(pelagem);
        a.setTamanho(tamanho);
        a.setPeso(peso);

        //Saida
        System.out.println("");
        System.out.println("__________________________");
        System.out.println("Todos os dados foram lidos");
        System.out.println("__________________________");
        System.out.println("");
        System.out.println("Animal: "+a.getAnimal_tipo());
        System.out.println("Raca: "+a.getRaca());
        System.out.println("Sexo: "+a.getSexo());
        System.out.println("Pelagem: "+a.getPelagem());
        System.out.println("Tamanho: "+a.getTamanho());
        System.out.println("Peso: "+a.getPeso());
    }

}
