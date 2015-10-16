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
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author UDESC
 */
public class PrincipalDinamico {

    static List<Pessoa> pessoas = null;
    static List<Profissao> profissoes = null;
    static Scanner s = new Scanner(System.in);

    private static void listarProfissoes() {
        int id = 0;
        for (Profissao p : profissoes) {
            System.out.println("id: " + (1 + id) + " - " + p.getNome());
            id++;
        }
    }

    private static Profissao lerProfissao() {
        Profissao saida = null;
        System.out.println("Qual o nome da profissao: ");
        saida = new Profissao(s.nextLine());
        return saida;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pessoas = new Vector<Pessoa>();
        profissoes = new Vector<Profissao>();
        Scanner s = new Scanner(System.in);

        int i;
        for (i = 0; i < 3; i++) {
            profissoes.add(lerProfissao());
        }
        listarProfissoes();
        String resp = "";
        do {
            Pessoa pessoa = new Pessoa();
            System.out.println("Qual o nome: ");
            pessoa.setNome(s.nextLine());
            System.out.println("Qual o telefone: ");
            pessoa.setTelefone(s.nextLine());
            System.out.println("Escolha uma profissao: ");
            listarProfissoes();
            pessoa.setProfissao(profissoes.get(s.nextInt()));
            s.nextLine();
            System.out.println("Escolha o genero: ");
            for(Genero g: Genero.values()){
                System.out.println("id: "+g.ordinal()+" - "+g.name());
            }
            pessoa.setGenero(Genero.values()[s.nextInt()]);
            s.nextLine();
            System.out.println("Ver de novo? ");
            resp = s.nextLine();
        } while (resp.equalsIgnoreCase("sim"));
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
            oos.writeObject(pessoas);
            //Dar descarga
            oos.flush();
            //Fechar o recurso
            oos.close();
        } catch (Exception e) {
            System.out.println("Erro na Criacao");
        }
    }
}
