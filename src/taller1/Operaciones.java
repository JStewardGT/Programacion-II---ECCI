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
public class Operaciones {
    
    private Arreglo numeriticos;//es un objeto de la clase Arreglo

    
    
    

    public void ordenar(Arreglo pArreglo){
         numeriticos =pArreglo;
         int temporal=0;
       for (int i = 0; i < numeriticos.Numeros.length; i++) {
        for (int j = 1; j < (numeriticos.Numeros.length - i); j++) {
            if (numeriticos.Numeros[j - 1] > numeriticos.Numeros[j]) {
                temporal = numeriticos.Numeros[j - 1];
                numeriticos.Numeros[j - 1] = numeriticos.Numeros[j];
                numeriticos.Numeros[j] = temporal;
            }
        }
    }
       
    }
   
    
    public int sumatoria(){
         
         int i=0,suma=0;
//         for (int sumatoria: numeriticos.Numeros){
//           total+= sumatoria;
//         }
//         
         while(i < numeriticos.Numeros.length){
          suma += numeriticos.Numeros[i]; 
          i++;
         }
        return suma;
        
        }
    
    public double promediar(){
        
        int i=0;
        double promedio=0;
//         for (double promedio: numeriticos.Numeros){
//           total+= promedio / numeriticos.Numeros.length;
//         }
         while(i <numeriticos.Numeros.length){
          promedio+= numeriticos.Numeros[i]; 
          i++;
         }
         promedio = promedio / numeriticos.Numeros.length;
         
        return promedio;
        }

}
