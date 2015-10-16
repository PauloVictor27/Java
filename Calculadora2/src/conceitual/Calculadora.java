/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conceitual;

/**
 *
 * @author UDESC
 */
public class Calculadora {
    public int soma(int n1, int n2){
        return (n1+n2);
    }
    public int subitrai(int n1, int n2){
        return (n1-n2);
    }
    public int divisao(int n1, int n2) throws Divisaozero{
        if (n2 != 0){
            return (n1+n2);
        }else{
            throw new Divisaozero();
        }
    }
    public int multiplica(int n1, int n2){
        return (n1*n2);
    }
    public int quadrado(int n1) throws QuadradoException{
        if (n1 != 0){
            return (n1^2);
        }else{
            throw new QuadradoException();
        }
    }
    public int raiz(int n1) throws RaizExeption{
        if (n1 != 0){
            return (n1^(1/2));
        }else{
            throw new RaizExeption();
        }
    }
}
