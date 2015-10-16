/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercicio3;

import java.io.Console;

/**
 *
 * @author PauloVitor
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        //Iniciar Consoler
        Console c;
        c = System.console();

        //Variaveis
        int prox = 0,atual = 0,ante = 1;
        
        //Fibonacci
        while(prox <= 100)
        {  
            prox = atual + ante;  
            System.out.print(prox+",");  
            ante = atual;  
            atual = prox;  
        }  
    }
    
}
