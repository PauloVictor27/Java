/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import conceitual.Cliente;
import conceitual.ItemVenda;
import conceitual.Produto;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author UDESC
 */
public class Vendas {

    static List<Cliente> clientes = null;
    static List<Produto> produtos = null;
    static List<ItemVenda> itemvendas = null;
    static Scanner s = new Scanner(System.in);

    private static Cliente lerCliente() {
        Cliente saida = new Cliente();
        System.out.println("Qual o nome: ");
        saida.setNome(s.nextLine());
        System.out.println("Qual a idade: ");
        saida.setIdade(s.nextInt());
        s.nextLine();
        return saida;
    }

    private static Produto lerProduto() {
        Produto saida = new Produto();
        System.out.println("Qual o nome: ");
        saida.setNome(s.nextLine());
        System.out.println("Qual o Preco: ");
        saida.setPreco(s.nextInt());
        s.nextLine();
        return saida;
    }
    
    private static ItemVenda lerItemVenda() {
        ItemVenda saida = new ItemVenda();
        System.out.println("Escolha um cliente: ");
        listarClientes();
        saida.setCliente(clientes.get(s.nextInt()));
        System.out.println("Escolha um produto");
        listarProduto();
        saida.setProduto(produtos.get(s.nextInt()));
        System.out.println("Quando itens foram vendidos: ");
        saida.setnVendas(s.nextInt());
        s.nextLine();
        return saida;
    }

    private static void listarProduto() {
        int id = 0;
        for (Produto p : produtos) {
            System.out.println("id:" + (id+1) + " - "
                    + p.getNome());
            id++;
        }
    }

    private static void listarClientes() {
        int id = 0;
        for (Cliente c : clientes) {
            System.out.println("id:" + (id+1) + " - "
                    + c.getNome());
            id++;
        }
    }

    private static void lerTodosProdutos() {
        for (int i = 0; i < 3; i++) {
            produtos.add(lerProduto());
        }
    }

    private static void lerTodosClientes() {
        for (int i = 0; i < 3; i++) {
            clientes.add(lerCliente());
        }
    }

    private static void inicilizar() {
        // instanciar as listas
        clientes = new Vector<Cliente>();
        produtos = new Vector<Produto>();
        itemvendas = new Vector<ItemVenda>();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //abrir arquivo
        File f = new File("g:/POO/Cliente e Produto/venda.txt");
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
        inicilizar();
        lerTodosClientes();
        listarClientes();
        lerTodosProdutos();
        listarProduto();

        String resp = "";
        do {
            itemvendas.add(lerItemVenda()); 
            System.out.println("deseja continuar?");
            resp = s.nextLine();
        } while (resp.equalsIgnoreCase("sim"));

        try {
            //pegar stream de saida
            FileOutputStream fos =
                    new FileOutputStream(f);
            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);
            //salva objeto
            oos.writeObject(clientes);
            oos.writeObject(produtos);
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
