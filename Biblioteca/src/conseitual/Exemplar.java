/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conseitual;

/**
 *
 * @author UDESC
 */
public class Exemplar {
    private String codigoExemplar;
    private Livro livro;

    public Exemplar (){
        livro = new Livro();
    }

    /**
     * @return the codigoExemplar
     */
    public String getCodigoExemplar() {
        return codigoExemplar;
    }

    /**
     * @param codigoExemplar the codigoExemplar to set
     */
    public void setCodigoExemplar(String codigoExemplar) {
        this.codigoExemplar = codigoExemplar;
    }

    /**
     * @return the livro
     */
    public Livro getLivro() {
        return livro;
    }

    /**
     * @param livro the livro to set
     */
    public void setLivro(Livro livro) {
        this.livro = livro;
    }

}
