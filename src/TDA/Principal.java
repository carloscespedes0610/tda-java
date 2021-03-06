package TDA;

import Arboles.Arbol_Binario;
import Arboles.Interface_Arbol_Binario;
import Arboles.Nodo_Ab;
import Cola.Cola;
import Listas_Simple.Lista;
import Listas_Simple.Nodo_Interface;
import Pila_Simple.Pila_Simple;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cespe
 */
public class Principal implements Nodo_Interface<per>,Interface_Arbol_Binario<Integer>{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal p =new Principal();
        p.probar_arboles_bin();
    }
    
    public void probar_arboles_bin(){
       Arbol_Binario <Integer> ab=new Arbol_Binario<>(this);
       ab.Insertar(5);
       ab.Insertar(7);
       ab.Insertar(3);
       ab.Insertar(2);
       ab.Insertar(4);
       ab.Insertar(1);
       
       ab.imprimir_preOrden();
       ab.imprimir_inOrden();
       ab.imprimir_postOrden();
       ab.altura();
    }
    
    public void probar_cola(){
        Cola<per> p=new Cola<>();
        p.Encolar(new per("carlos", 28));
        p.Encolar(new per("erika", 29));
        p.Encolar(new per("luis", 21));
        p.Encolar(new per("paola", 16));
        p.Encolar(new per("vivi", 50));
        p.Encolar(new per("mary", 40));
        p.Encolar(new per("isa", 3));
        p.Encolar(new per("karla", 4));
        p.Encolar(new per("mau", 24));
        p.Imprimir();
        System.out.println("--- desapilando ---");
        System.out.println(p.Desencolar().toString());
        System.out.println(p.Desencolar().toString());
        System.out.println(p.Desencolar().toString());
        System.out.println(p.Desencolar().toString());
        System.out.println(p.Desencolar().toString());
        System.out.println(p.Desencolar().toString());
        System.out.println(p.Desencolar().toString());
        System.out.println(p.Desencolar().toString());
        System.out.println(p.Desencolar().toString());
    }
    
    public void probar_pila(){
        Pila_Simple<per> p=new Pila_Simple<>();
        p.Push(new per("carlos", 28));
        p.Push(new per("erika", 29));
        p.Push(new per("luis", 21));
        p.Push(new per("paola", 16));
        p.Push(new per("vivi", 50));
        p.Push(new per("mary", 40));
        p.Push(new per("isa", 3));
        p.Push(new per("karla", 4));
        p.Push(new per("mau", 24));
        p.imprimir();
        System.out.println("--- desapilando ---");
        System.out.println(p.Pop().toString());
        System.out.println(p.Pop().toString());
        System.out.println(p.Pop().toString());
        System.out.println(p.Pop().toString());
        System.out.println(p.Pop().toString());
        System.out.println(p.Pop().toString());
        System.out.println(p.Pop().toString());
        System.out.println(p.Pop().toString());
        System.out.println(p.Pop().toString());
    }
    
    public void probar_lista(){
        Lista<per> l=new Lista<>(this);
        l.Insertar_Ordenado(new per("carlos", 28));
        l.Insertar_Ordenado(new per("erika", 29));
        l.Insertar_Ordenado(new per("luis", 21));
        l.Insertar_Ordenado(new per("paola", 16));
        l.Insertar_Ordenado(new per("vivi", 50));
        l.Insertar_Ordenado(new per("mary", 40));
        l.Insertar_Ordenado(new per("isa", 3));
        l.Insertar_Ordenado(new per("karla", 4));
        l.Insertar_Ordenado(new per("mau", 24));
        l.Imprimir();
        
        System.out.println("---------despues de eliminar --------------");
        l.eliminar(10);
        l.Imprimir();
        
    }

    @Override
    public int Comparar(per o1, per o2) {
        int a=0,b=0;
        
        // ordenando por edad
        //a= o1.getEdad(); b=o2.getEdad();
        
        // ordenando por la primera letra del nombre
        a=Character.getNumericValue(o1.getNombre().charAt(0));
        b=Character.getNumericValue(o2.getNombre().charAt(0));
        
        if(a>b){
            return 1;
        } else {
            if(a<b){
                return -1;
            }
            return 0;
        }
    }

    @Override
    public int Comparar_AB(Integer o1, Integer o2) {
        if(o1>o2){
            return 1;
        }else{
            if(o1<o2){
                return -1;
            }
            return 0;
        }
    }


    
}
