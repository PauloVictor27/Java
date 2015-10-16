/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.poo.provasemserie.ui;

import br.udesc.poo.provasemserie.conceitual.Disciplinas;
import br.udesc.poo.provasemserie.conceitual.Prova;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
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
        //Variaveis
        File n = new File("g:/POO/Provas em Serie/provas.txt");
        if (n.exists()) {
            System.out.println("arquivo existente!");
        } else {
            try {
                n.createNewFile();
            } catch (IOException ex) {
                //sair do programa
                System.exit(0);
            }
            System.out.println("arquivo criado");
        }

        List<Prova> provas = new Vector<Prova>();
        //
        try {
            FileInputStream nis
                    = new FileInputStream(n);
            ObjectInputStream ois
                    = new ObjectInputStream(nis);
            provas
                    = (List<Prova>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("problemas ao ler!");
        }

        Scanner s = new Scanner(System.in);
        Vector<Prova> vetProva = new Vector();
        String aluno, turma;
        int i = 0;
        int nota;

        while (i < 5) {
            Prova prova = new Prova();
            System.out.println("Digite o nome do aluno da " + (i + 1) + " Prova: ");
            aluno = s.next();
            prova.setAluno(aluno);
            System.out.println("Digite a turma da " + (i + 1) + " Prova: ");
            turma = s.next();
            prova.setTurma(turma);
            System.out.println("Digite a disciplina da " + (i + 1) + " Prova: ");
            prova.setDisciplina(Disciplinas.values()[s.nextInt()]);
            System.out.println("Digite a nota " + (i + 1) + " Prova: ");
            nota = s.nextInt();
            prova.setNota(nota);
            vetProva.add(prova);
            i++;
        }

        //Escolher um arquivo
        File f = new File("g:/POO/Provas em Serie/provas.txt");
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
            oos.writeObject(vetProva);
            //Dar descarga
            oos.flush();
            //Fechar o recurso
            oos.close();
        } catch (Exception e) {
            System.out.println("Erro na Criacao");
        }
    }

}
