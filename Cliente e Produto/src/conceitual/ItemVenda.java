/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conceitual;

import java.io.Serializable;

/**
 *
 * @author PauloVitor
 */
public class ItemVenda implements Serializable{
    private Cliente cliente;
    private Produto produto;
    private int nVendas;

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the produto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * @return the nVendas
     */
    public int getnVendas() {
        return nVendas;
    }

    /**
     * @param nVendas the nVendas to set
     */
    public void setnVendas(int nVendas) {
        this.nVendas = nVendas;
    }
}
