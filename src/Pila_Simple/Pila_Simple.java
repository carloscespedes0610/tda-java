/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila_Simple;

import Listas_Simple.Nodo;

/**
 *
 * @author cespe
 */
public class Pila_Simple<T> {
    private Nodo<T> Tope;
    private int dimension;

    public Pila_Simple() {
    }
    
    public void Push(T elem){
        Nodo<T> nuevo = new Nodo<>(elem,null);
        if(Vacia()){
            this.Tope=nuevo;
        }else{
            nuevo.setSiguiente(this.Tope);
            this.Tope=nuevo;
        }
        this.dimension++;
    }
    
    public T Pop(){
        if(!Vacia())
        {
            Nodo<T> aux=this.Tope;
            this.Tope=this.Tope.getSiguiente();
            return aux.getValor();
        }
        return null;
    }
    
    public boolean Vacia(){
        return (this.Tope==null);
    }
    
    public void imprimir(){
        if(!Vacia()){
            Nodo<T> aux = this.Tope;
            int i=0;
            while(aux!=null){
                System.out.println("i: "+i+" ->"+aux.getValor().toString());
                aux=aux.getSiguiente(); i++;
            }
        }else{
            System.out.println("Pila Vacia");
        }
    }
}
