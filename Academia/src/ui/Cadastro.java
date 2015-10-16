/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import conseitual.Aluno;
import conseitual.AlunoBasquete;
import conseitual.AlunoFutebol;
import conseitual.AlunoNatacao;
import conseitual.AlunoVolei;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author UDESC
 */
public class Cadastro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Iniciacao
        Scanner s = new Scanner(System.in);

        //Variaveis
        Vector<Aluno> vetAlunos = new Vector();
        String atividade;
        String nome;
        String sexo;
        int alunoNovo = 0;
        int alunoVelho = 0;
        int idade;
        int menor = 1000;
        int maior = 0;
        int nMulheres = 0;
        int idosos = 0;
        int i = 0;

        //Entrada
        while (i < 5) {
            System.out.println("\nDigite a atividade do " + (i + 1) + " aluno: ");
            atividade = s.nextLine();

            if (atividade.equals("Volei")) {
                Aluno aluno = new AlunoVolei();
                System.out.println("\nDigite o nome do aluno: ");
                nome = s.nextLine();
                aluno.setNome(nome);
                System.out.println("\nDigite o sexo do aluno (M para masculino e F para feminino): ");
                sexo = s.nextLine();
                aluno.setSexo(sexo);
                if (sexo.equals("F")) {
                    nMulheres++;
                }
                System.out.println("\nDigite a idade do aluno: ");
                idade = s.nextInt();
                aluno.setIdade(idade);
                if (idade < menor) {
                    menor = idade;
                    alunoNovo = i;
                }
                if (idade > maior) {
                    maior = idade;
                    alunoVelho = i;
                }
                if (idade >= 60) {
                    idosos++;
                }
                vetAlunos.add(aluno);
                i++;
            } else if (atividade.equals("Futebol")) {
                Aluno aluno = new AlunoFutebol();
                System.out.println("\nDigite o nome do aluno: ");
                nome = s.nextLine();
                aluno.setNome(nome);
                System.out.println("\nDigite o sexo do aluno (M para masculino e F para feminino): ");
                sexo = s.nextLine();
                aluno.setSexo(sexo);
                if (sexo.equals("F")) {
                    nMulheres++;
                }
                System.out.println("\nDigite a idade do aluno: ");
                idade = s.nextInt();
                aluno.setIdade(idade);
                if (idade < menor) {
                    menor = idade;
                    alunoNovo = i;
                }
                if (idade > maior) {
                    maior = idade;
                    alunoVelho = i;
                }
                if (idade >= 60) {
                    idosos++;
                }
                vetAlunos.add(aluno);
                i++;
            } else if (atividade.equals("Natacao")) {
                Aluno aluno = new AlunoNatacao();
                System.out.println("\nDigite o nome do aluno: ");
                nome = s.nextLine();
                aluno.setNome(nome);
                System.out.println("\nDigite o sexo do aluno (M para masculino e F para feminino): ");
                sexo = s.nextLine();
                aluno.setSexo(sexo);
                if (sexo.equals("F")) {
                    nMulheres++;
                }
                System.out.println("\nDigite a idade do aluno: ");
                idade = s.nextInt();
                aluno.setIdade(idade);
                if (idade < menor) {
                    menor = idade;
                    alunoNovo = i;
                }
                if (idade > maior) {
                    maior = idade;
                    alunoVelho = i;
                }
                if (idade >= 60) {
                    idosos++;
                }
                vetAlunos.add(aluno);
                i++;
            } else if (atividade.equals("Basquete")) {
                Aluno aluno = new AlunoBasquete();
                System.out.println("\nDigite o nome do aluno: ");
                nome = s.nextLine();
                aluno.setNome(nome);
                System.out.println("\nDigite o sexo do aluno (M para masculino e F para feminino): ");
                sexo = s.nextLine();
                aluno.setSexo(sexo);
                if (sexo.equals("F")) {
                    nMulheres++;
                }
                System.out.println("\nDigite a idade do aluno: ");
                idade = s.nextInt();
                aluno.setIdade(idade);
                if (idade < menor) {
                    menor = idade;
                    alunoNovo = i;
                }
                if (idade > maior) {
                    maior = idade;
                    alunoVelho = i;
                }
                if (idade >= 60) {
                    idosos++;
                }
                vetAlunos.add(aluno);
                i++;
            } else {
                System.out.println("\nAtividade Invalida.");
            }
        }

        //Saida
        System.out.println("\nNumero de mulheres: " + nMulheres);
        System.out.println("\nNumero de idosos: " + idosos);
        System.out.println("\nO aluno mais novo eh o: " + vetAlunos.get(alunoNovo).getNome());
        System.out.println("\nO aluno mais novo eh o: " + vetAlunos.get(alunoVelho).getNome());
    }
}
