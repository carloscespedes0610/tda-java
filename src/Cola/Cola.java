/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cola;

import Listas_Simple.Nodo;

/**
 *
 * @author cespe
 */
public class Cola<T> {
    private Nodo<T> Tope;
    private int dimension;

    public Cola() {
    }
    
    public void Encolar(T elem){
        Nodo<T> nuevo = new Nodo(elem,null);
        if(Vacia()){
            this.Tope=nuevo;
        }else{
            Nodo<T> aux=this.Tope;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        this.dimension++;
    }
    
    public T Desencolar(){
        if(!Vacia()){
            Nodo<T> aux=this.Tope;
            this.Tope=this.Tope.getSiguiente();
            return aux.getValor();
        }
        return null;
    }
    
    public void Imprimir(){
        if(!Vacia()){
            Nodo<T> aux=this.Tope; int i=0;
            while(aux!=null){
                System.out.println("i: "+i+" -> "+aux.getValor().toString());
                aux=aux.getSiguiente();i++;
            }
        }else{
            System.out.println("Cola Vacia");
        }
    }
    
    public boolean Vacia(){
        return (this.Tope==null);
    }
    
}
