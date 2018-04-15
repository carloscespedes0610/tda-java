/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arboles;

/**
 *
 * @author cespe
 */
public class Nodo_Ab<T> {
    private T valor;
    private Nodo_Ab<T> hi;
    private Nodo_Ab<T> hd;

    public Nodo_Ab(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo_Ab<T> getHi() {
        return hi;
    }

    public void setHi(Nodo_Ab<T> hi) {
        this.hi = hi;
    }

    public Nodo_Ab<T> getHd() {
        return hd;
    }

    public void setHd(Nodo_Ab<T> hd) {
        this.hd = hd;
    }
    
    
    
}
