/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package animal;

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
        //Iniciação
        Passaro p = new Passaro();
        Cachorro c = new Cachorro();
        Gato g = new Gato();

        //Construido Objetos
        p.setNome("Piu-Piu");
        c.setNome("Rex");
        g.setNome("Flajola");

        //Saida
        System.out.println("\nNome do passaro: "+p.getNome());
        p.fazerBarulho();
        System.out.println("\nNome do cachorro: "+c.getNome());
        c.fazerBarulho();
        System.out.println("\nNome do gato: "+g.getNome());
        g.fazerBarulho();
    }

}
