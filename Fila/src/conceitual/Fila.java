/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package conceitual;

import java.util.ArrayList;

/**
 *
 * @author UDESC
 */
public class Fila {

    ArrayList<Pessoa> pilha = new ArrayList<Pessoa>();

    public void emfilerar(Pessoa p) {
        pilha.add(p);
    }

    public Pessoa desemfilerar() {
        int tam = pilha.size();
        Pessoa p = pilha.get(0);
        pilha.remove(p);
        return p;
    }

    public Pessoa cabeca() {
        int tam = pilha.size();
        Pessoa p = pilha.get(0);
        return p;
    }
}
