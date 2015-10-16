/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import conceitual.Usuario;
import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.swing.*;

/**
 *
 * @author UDESC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame win = new JFrame("My First GUI Program");
        Usuario u = new Usuario();

        File f = new File("f:/POO/JavaApplication1/pontuacao.txt");
        if (f.exists()) {
            System.out.println("arquivo existente!");
        } else {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                //sair do programa
                System.exit(0);
            }
            System.out.println("arquivo criado");
        }

        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setLayout(new FlowLayout(FlowLayout.LEFT));
        win.setSize(650, 350);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                JButton but1 = new JButton(String.valueOf(i) + " - " + String.valueOf(j));
                win.add(but1);
            }
        }
        win.setVisible(true);

        try {
            //pegar stream de saida
            FileOutputStream fos
                    = new FileOutputStream(f);
            ObjectOutputStream oos
                    = new ObjectOutputStream(fos);
            //salva objeto
            oos.writeObject(u.getNome());
            oos.writeObject(u.getPontuacao());
            //da descarga
            oos.flush();
            //fecha o recurso
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("deu pau!");
        }
    }
}
