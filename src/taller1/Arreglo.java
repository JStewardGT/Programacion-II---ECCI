/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1;

import java.util.Arrays;

/**
 *
 * @author ESTACION
 */
public class Arreglo {
    
    //atributos
    public int Numeros[];
    
    public void llenarArreglo(int i){
     
        Numeros= new int[i];
        
        for(int x = 0; x<Numeros.length;x++ ){
            
           Numeros[x]= (int) (Math.random() * x+6) + 1;
        }
    }
    
    public void imprimirArreglo(){
    
//     for (int numerito : Numeros) {
//            System.out.println(numerito);
//            
//        }
        
         System.out.println(Arrays.toString(Numeros));
    }
    
 
    
}
