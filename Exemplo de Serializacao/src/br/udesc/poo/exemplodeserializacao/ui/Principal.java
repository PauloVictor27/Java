/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.poo.exemplodeserializacao.ui;

import br.udesc.poo.exemplodeserializacao.conceitual.Genero;
import br.udesc.poo.exemplodeserializacao.conceitual.Pessoa;
import br.udesc.poo.exemplodeserializacao.conceitual.Profissao;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        Profissao prof1 = new Profissao("Professor");
        Profissao prof2 = new Profissao("Programador");

        Pessoa p1, p2, p3;
        p1 = new Pessoa("Gabriel", "2222-3333", Genero.MASCULINO, prof2);
        p2 = new Pessoa("Aline", "1112-3333", Genero.FEMININO, prof1);
        p3 = new Pessoa("Pv", "9139-2007", Genero.MASCULINO, prof2);

        //Escolher um arquivo
        File f = new File("f:/POO/Exemplo de Serializacao/seria_ex.txt");
        if (f.exists()) {
            System.out.println("Arquivo Existente");
        } else {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                //Sair do programa
                System.exit(0);
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Arquivo Criado");
        }
        try {
            //Pegar strem de saida
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Salvar objeto
            oos.writeObject(p3);
            //Dar descarga
            oos.flush();
            //Fechar o recurso
            oos.close();
        } catch (Exception e) {
            System.out.println("Erro na Criacao");
        }
    }
}
