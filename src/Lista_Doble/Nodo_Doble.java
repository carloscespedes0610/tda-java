/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista_Doble;

/**
 *
 * @author cespe
 */
public class Nodo_Doble<T> {
    private T valor;
    private Nodo_Doble<T> anterior;
    private Nodo_Doble<T> siguiente;

    public Nodo_Doble(T valor, Nodo_Doble<T> anterior, Nodo_Doble<T> siguiente) {
        this.valor = valor;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Nodo_Doble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo_Doble<T> anterior) {
        this.anterior = anterior;
    }

    public Nodo_Doble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo_Doble<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
