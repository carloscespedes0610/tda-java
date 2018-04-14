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
    
    public void Insertar_Ordenado(T o){
        Nodo<T> nuevo = new Nodo<>(o,null);
        if(Vacia()){
            this.raiz=nuevo;
            this.dimension++;
        }else{
            Nodo<T> aux = this.raiz;
            Nodo<T> anterior = null;
            // vamos avanzando si el elemento actual es menor que el que se va a insertar
            while(aux!=null && this.inter.Comparar(aux.getValor(), nuevo.getValor())==-1){
                anterior = aux;
                aux=aux.getSiguiente();
            }
                        
            // preguntamos si va en el primer elemento
            if(anterior == null){
                nuevo.setSiguiente(this.raiz);
                this.raiz=nuevo;
            }else{
                // es del medio o ultimo
                anterior.setSiguiente(nuevo);
            }
            // si aux!= null, significa que hay elementos todavia detras del nuevo
            if(aux!=null){
                nuevo.setSiguiente(aux);
            }
            this.dimension++;
        }
    }
    
    public void eliminar(int posicion){
        if(!Vacia()){
            if(this.dimension<=posicion){
                System.out.println("Error Posicion Invalida");
                return;
            }
            // preguntamos si el primero
            if(posicion==0){
                this.raiz=this.raiz.getSiguiente();
                this.dimension--;
                return;
            }
            // preguntamos si es ultimo
            if(this.dimension==posicion+1){
                Nodo<T> aux=this.raiz;
                Nodo<T> anterior=null;
                while(aux.getSiguiente()!=null){
                    anterior=aux;
                    aux=aux.getSiguiente();
                }
                anterior.setSiguiente(null);
                this.dimension--;
                return;
            }
                // si es del medio
                int c=0;
                Nodo<T> aux=this.raiz;
                Nodo<T> anterior=null;
                while(aux!=null){
                    if(c==posicion){
                        // sabemos que no habra excepcion de error de aux.getsiguiente
                        // por que sabemos que es un elemento del medio de la lista
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    anterior =aux;
                    aux=aux.getSiguiente();c++;
                }
        }else{
            System.out.println("Lista Vacia, Error al Eliminar");
        }
    }
    
    public T get(int posicion){
        if(!Vacia()){
            if(posicion<=this.dimension){
                Nodo<T> aux=this.raiz;
                int c=0;
                while(aux!=null){
                    if(c==posicion){
                        return aux.getValor();
                    }
                    c++;
                    aux=aux.getSiguiente();
                }
            }
            System.out.println("Posicion Invalida");
            return null;
            
        }else{
            System.out.println("Lista Vacia");
            return null;
        }
    }
    
    public void Imprimir(){
        if(!Vacia()){
            Nodo<T> aux = this.raiz;
            int i =0;
            while(aux!=null){
                System.out.println("i: "+i+" -> "+aux.getValor().toString());
                aux=aux.getSiguiente();
                i++;
            }
        }else{
            System.out.println("Lista Vacia!!!!");
        }
        
    }
    
}
