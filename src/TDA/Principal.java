package TDA;

import Listas_Simple.Lista;
import Listas_Simple.Nodo_Interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cespe
 */
public class Principal implements Nodo_Interface<per>{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal p =new Principal();
        p.probar();
    }
    
    public void probar(){
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


    
}
