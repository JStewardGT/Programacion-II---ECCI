package taller1;

import java.util.ArrayList;
import java.util.List;

public class NewMain {
public static void main(String[] args) {
        
          Arreglo arr = new Arreglo();
          
          arr.llenarArreglo(5);
          arr.imprimirArreglo();
          
          Operaciones op = new Operaciones();
          
          op.ordenar(arr);
          
          arr.imprimirArreglo();
          System.out.println("La suma es: "+op.sumatoria());
          System.out.println("Promedio: "+ op.promediar());
          
          //System.out.println((Math.random() * 10) + 1);
          
    }
    
}
