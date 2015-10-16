/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo2;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author UDESC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.useLocale(Locale.US);
        Vector<Float> uva = new Vector();
        float p;
        System.out.print("Digite o peso da caixa de uva(-1 para sair):");
        p = s.nextFloat();
        while (p != -1.0) {
            uva.add(p);
            System.out.print("Digite o peso da caixa de uva(-1 para sair):");
            p = s.nextFloat();
        }
        float uvaSum = 0;
        for (Float uva_peso : uva) {
            uvaSum += uva_peso;
        }
        int uvaCount = uva.size();
        float uvaMedia = uvaSum / uvaCount;

        System.out.println("Total de caixas: " + uvaCount);
        System.out.println("Peso Total: " + uvaSum);
        System.out.println("Media das caixas: " + uvaMedia);

    }
}
