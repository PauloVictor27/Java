/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author UDESC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner (System.in);
        int idade = 0;
        System.out.println("Digite sua idade: ");
        try{
            //Codigo Protegido
            idade = s.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Voce deve digitar um inteiro");
        }
        System.out.println("Sua idade eh: "+idade);
    }

}
