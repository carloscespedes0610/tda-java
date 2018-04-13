/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas_Simple;

/**
 *
 * @author cespe
 */
public class Nodo<T> {
    private T valor;
    private Nodo<T> siguiente = null;

    public Nodo() {
        this.valor = null;
        this.siguiente=null;
    }

    public Nodo(T valor, Nodo siguiente) {
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
