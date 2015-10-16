/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package carro;

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

        Modelo mo = new Modelo ();
        Cor cr = new Cor ();
        Combustivel cm = new Combustivel ();

        //Variaveis
        String modelo;
        String cor;
        String combustivel;

        //Entrada
        modelo = c.readLine("Digite o modelo do carro: ");
        cor = c.readLine("Digite a cor do carro: ");
        combustivel = c.readLine("Digite o combustivel do carro: ");

        //Construção de Objetos
        mo.setModelo(modelo);
        cr.setCor(cor);
        cm.setCombustivel(combustivel);

        //Saida
        System.out.println("\nCarro registrado com sucesso\n");
        mo.registro(mo.getModelo());
        cr.registro(cr.getCor());
        cm.registro(cm.getCombustivel());
    }

}
