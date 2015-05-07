/*
* NOMBRE PROGRAMA: NUMERO PAR O IMPAR
* AUTOR:PAULO ALVIS
* FECHA: MAY 7 2015
*/
package punto5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParOImpar {
	public static void main(String[] args) throws IOException { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingresa un numero entero: ");  
        int numero = Integer.parseInt(in.readLine( )); 
        //con el numero ingresado se calcula a traves del modulo si es par o impar
        if(numero%2==0){  
             System.out.println(numero+" es par");  
        }else{  
            System.out.println(numero+" es impar");  
        }        
     }  
}
