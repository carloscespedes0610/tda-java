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
        /*int vec[] = {1,2,3,4};
        int aux[] = vec;
        vec =null;
        System.out.println("vec: "+vec+" aux: "+aux);
        
        per a[]={new per("carlos", 28),new per("erika", 29)};
        per b[]=a;
        a=null;
        System.out.println("a: "+a+" b: "+b[1].nombre);*/
        
        Principal p =new Principal();
        p.probar();
        
    }
    
    public void probar(){
        Lista<per> l=new Lista<per>(this);
        l.Insertar(new per("carlos", 28));
        l.Insertar(new per("erika", 29));
        l.Insertar(new per("luis", 21));
        l.Imprimir();
        
    }


    
}
