/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ui;

import conseitual.Pessoa;
import conseitual.PessoaFisica;
import conseitual.PessoaJuridica;

/**
 *
 * @author UDESC
 */
public class PrincipalPessoa {
    static final int MAX_PESSOAS = 5;
    public static int nPessoas = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa p1 = new Pessoa();
        if(nPessoas > MAX_PESSOAS){
            System.out.println("Extendeu o limite! 1: "+nPessoas);
        }

        PessoaFisica p2 = new PessoaFisica();
        if(nPessoas > MAX_PESSOAS){
            System.out.println("Extendeu o limite! 2: "+nPessoas);
        }

        PessoaJuridica p3 = new PessoaJuridica();
        if(nPessoas > MAX_PESSOAS){
            System.out.println("Extendeu o limite! 3: "+nPessoas);
        }

        Pessoa p4 = new PessoaFisica();
        if(nPessoas > MAX_PESSOAS){
            System.out.println("Extendeu o limite! 4: "+nPessoas);
        }

        Pessoa p5 = new PessoaJuridica();
        if(nPessoas > MAX_PESSOAS){
            System.out.println("Extendeu o limite! 5: "+nPessoas);
        }

        Pessoa p6 = new PessoaFisica("8888-99", "2222-2", 0);
        if(nPessoas > MAX_PESSOAS){
            System.out.println("Extendeu o limite! 6: "+nPessoas);
        }
    }

}
