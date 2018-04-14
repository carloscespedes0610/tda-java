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
public interface Nodo_Interface <T> {
   
   /*
    comparar devuelve 1 si o1>o2, -1 si o1<o2 y 0 si o1=o2
    */ 
   public int Comparar(T o1, T o2);  
}
