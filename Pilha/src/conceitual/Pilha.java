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
public class Pilha {
    ArrayList<Pessoa> pilha = new ArrayList<Pessoa>();
    
    public void empilhar(Pessoa p){
        pilha.add(p);
    }
    
    public Pessoa desempilha(){
        int tam = pilha.size();
        Pessoa p = pilha.get(tam-1);
        pilha.remove(p);
        return p;
    }
    public Pessoa topo(){
        int tam = pilha.size();
        Pessoa p = pilha.get(tam-1);
        return p;
    }
}
