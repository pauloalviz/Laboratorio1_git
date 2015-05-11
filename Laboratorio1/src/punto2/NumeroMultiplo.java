/*
* NOMBRE PROGRAMA: NUMERO MULTIPLO
* AUTOR:PAULO ALVIS
* FECHA: MAY 5 2015
*/
package punto2;

public class NumeroMultiplo {
	public static void main(String arg[]){
		//declaracion de variales
		
		int modulo;
		int numero1 = 21;
		int numero2 = 3;
		
		//operacion modulo
		
		modulo = numero1%numero2;
		
		if (modulo==0){
		  System.out.println(numero1 + " es múltiplo de " + numero2);
		}else{
		  System.out.println(numero1 + " NO es múltiplo de " + numero2);
		}
	}
}
