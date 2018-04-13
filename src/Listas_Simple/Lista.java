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
public class Lista<T> {
    private Nodo<T> raiz;
    private int dimension;
    private Nodo_Interface<T> inter;

    public Lista(Nodo_Interface<T> interface_nodo) {
        dimension = 0;
        this.inter=interface_nodo;
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public int getDimension() {
        return dimension;
    }
    
    public boolean Vacia(){
        return (this.raiz == null);
    }
    
    public void Insertar(T o){  // al final
        Nodo<T> nuevo = new Nodo(o, null);
        if(Vacia()){ // si es el primero
            this.raiz = nuevo;
            this.dimension++;
        }else{
            Nodo aux=this.raiz;
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            this.dimension++;
        }
    }
    
    public T get(){
        return this.raiz.getValor();
    }
    
    public void Imprimir(){
        if(!Vacia()){
            Nodo<T> aux = this.raiz;
            int i =0;
            while(aux!=null){
//                System.out.println("i: "+i+" -> "+this.inter.Imprimir(aux.getValor()));
                System.out.println("i: "+i+" -> "+aux.getValor().toString());
                aux=aux.getSiguiente();
                i++;
            }
        }else{
            System.out.println("Lista Vacia!!!!");
        }
        
    }
    
}
