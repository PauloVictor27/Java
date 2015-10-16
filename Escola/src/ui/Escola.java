/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import conceitual.Aluno;
import java.util.Vector;

/**
 *
 * @author Wesley
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Aluno> alunos = new Vector();

        Aluno a = new Aluno();
        a.setNome("Godolfredo");
        Aluno b = new Aluno();
        b.setNome("Pafuncia");
        Aluno c = new Aluno();
        c.setNome("Lucas");
        System.out.println("colecao vazia===============");
        for (Aluno x : alunos) {
            System.out.println("nome:" + x.getNome());
        }
        alunos.add(a);
        alunos.add(b);
        alunos.add(c);
        System.out.println("===============");
        for (Aluno x : alunos) {
            System.out.println("nome:" + x.getNome());
        }
        alunos.remove(b);
        System.out.println("===============");
        for (Aluno x : alunos) {
            System.out.println("nome:" + x.getNome());
        }
        System.out.println("===============");
        Aluno d = new Aluno();
        d.setNome("Maria");
        alunos.add(1, d);
        System.out.println("==========depois de adicionar na posicao=====");
        for (Aluno x : alunos) {
            System.out.println("nome:" + x.getNome());
        }
        alunos.set(0, b);
        System.out.println("==========depois substituir=====");
        for (Aluno x : alunos) {
            System.out.println("nome:" + x.getNome());
        }
    }
}
