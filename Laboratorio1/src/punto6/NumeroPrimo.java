/*
* NOMBRE PROGRAMA: NUMERO PRIMO
* AUTOR:PAULO ALVIS
* FECHA: MAY 7 2015
*/
package punto6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeroPrimo {
	public static void main(String[] args) throws IOException { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//variables a utilizar
		int contador = 2;
        boolean primo=true;
        
		//captura de numero
		System.out.println("\tIngresa un numero: ");  
        int numero = Integer.parseInt(in.readLine( )); 
        
        //Calculamos si el numero es primo con esta iteracion
        if (numero == 1){
        	primo = true;
        }else{        
	        while ((primo) && (contador!=numero)){
	          if (numero % contador == 0){
	            primo = false;
	          }
	          contador++;
	        }
	    }
        if(primo){
        	System.out.println("\nEl numero es primo");
        }else{
        	System.out.println("\nEl numero no es primo");
        }
      }
}
