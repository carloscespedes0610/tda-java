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
public class Arbol_Binario<T> {
    private Interface_Arbol_Binario<T> inter;
    private Nodo_Ab<T> raiz;
    private int cantidad;

    public Arbol_Binario(Interface_Arbol_Binario<T> inter) {
        this.inter = inter;
    }
    
    public void Insertar(T ele){
        Nodo_Ab<T> nuevo = new Nodo_Ab<>(ele);
        if(Vacio())
        {
            this.raiz=nuevo;
        }else{
            Nodo_Ab<T> aux=this.raiz;
            Nodo_Ab<T> anterior=null;
            int comparacion;
            while(aux!=null){
                anterior=aux;
                comparacion=this.inter.Comparar_AB(aux.getValor(), ele);
                switch(comparacion){
                    case 1: aux=aux.getHi(); break; //aux>ele
                    case 0: System.out.println("el elemento existe: "+ele.toString());return;
                    case -1: aux=aux.getHd(); break; // aux<ele
                }
            }
            comparacion=this.inter.Comparar_AB(anterior.getValor(), ele);
            if(comparacion==1){
                anterior.setHi(nuevo);
            }else{
                anterior.setHd(nuevo);
            }
        }
        this.cantidad++;
    }
    
    private void imprimir_preOrden(Nodo_Ab<T> nod){
        if(nod!=null){
            System.out.print(nod.getValor().toString()+", ");
            imprimir_preOrden(nod.getHi());
            imprimir_preOrden(nod.getHd());
        }
    }
    
    public void imprimir_preOrden(){
        // raiz,hi,hd
        if(!Vacio()){
            System.out.println("recorrido preOrden:");
            imprimir_preOrden(this.raiz);
            System.out.println("");
        }else{
            System.out.println("arbol vacio");
        }
    }
    
    private void inOrden(Nodo_Ab<T> nod){
        if(nod!=null){
            inOrden(nod.getHi());
            System.out.print(nod.getValor().toString()+", ");
            inOrden(nod.getHd());
        }
    }
    
    public void imprimir_inOrden(){
        //hi,raiz,hd
        if(!Vacio()){
            System.out.println("recorrido inOrden:");
            inOrden(this.raiz);
            System.out.println("");
        }else{
            System.out.println("arbol vacio");
        }
    }
    
    private void postOrden(Nodo_Ab<T> nod){
        if(nod!=null){
            postOrden(nod.getHi());
            postOrden(nod.getHd());
            System.out.print(nod.getValor().toString()+", ");
        }
    }
    
    public void imprimir_postOrden(){
        // hi,hd,raiz
        if(!Vacio()){
            System.out.println("recorrido postOrden");
            postOrden(this.raiz);
            System.out.println("");
        }else{
            System.out.println("Arbol Vacio");
        }
    }
    
    private int altura_aux(Nodo_Ab<T> nod){
            if(nod!=null){
                int r=Math.max(altura_aux(nod.getHi()), altura_aux(nod.getHd()));
                return 1+r;
            }
        return 0;
    }
    
    public void altura(){
        System.out.println("altura: "+altura_aux(this.raiz));
    }
    
    public boolean Vacio(){
       return (this.raiz==null);
    }
}
