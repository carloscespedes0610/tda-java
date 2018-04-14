/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pila_Simple;

import Lista_Doble.Nodo_Doble;
import Listas_Simple.Nodo;
import Listas_Simple.Nodo_Interface;

/**
 *
 * @author cespe
 */
public class Pila <T>{
    private Nodo_Doble<T> Tope;
    private int dimension;
    //private Nodo_Interface<T> inter;

    public Pila() {
        //this.inter=interface_nodo;
    }
    
    public void Push(T elemento){
        Nodo_Doble<T> nuevo = new Nodo_Doble<>(elemento,null,null);
        if(Vacia()){
            this.Tope=nuevo;
        }else{
            this.Tope.setSiguiente(nuevo);
            nuevo.setAnterior(this.Tope);
            this.Tope=nuevo;
        }
        this.dimension++;
    }
    
    public T Pop(){
        if(!Vacia()){
            Nodo_Doble<T> aux=this.Tope;
            this.Tope=this.Tope.getAnterior();
            //preguntamos que si es el ultimo
            if(this.Tope!=null){
                this.Tope.setSiguiente(null);
            }
            this.dimension--;
            return aux.getValor();
        }
        return null;
    }
    
    public boolean Vacia(){
        return this.Tope==null;
    }
    
    public void Imprimir(){
        if(!Vacia()){
            Nodo_Doble<T> aux=this.Tope;
            int i=this.dimension-1;
            while(aux!=null){
                System.out.println("i: "+i+" -> "+aux.getValor().toString());
                i--;
                aux=aux.getAnterior();
            }
        }else{
            System.out.println("Pila Vacia");
        }
    }
    
    
    
}
