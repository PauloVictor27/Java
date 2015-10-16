/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo1;

import java.io.Console;

/**
 * Calcula a media de n pessoas, sendo que n é informado pelo usuario
 * @author Paulo Victor de Aguiar
 * @version 1.0
 */
public class PrincipalMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variaveis
        int n = 0, i;
        float media = 0f, nota = 0f;

        //Iniciar Consoler
        Console c = System.console();

        if (c == null)
        {
            System.out.println("Vc precisa estar no prompt!");
            System.exit(1);
        }
        
        //n
        n = Integer.parseInt(c.readLine("Quantos alunos?"));
        for(i = 0; i < n; i++)
        {
            nota = Float.parseFloat(c.readLine("Informe nota ("+i+")"));
            media += nota;
        }
        media = media/n;
        System.out.println("A media eh: "+media);
    }

}
