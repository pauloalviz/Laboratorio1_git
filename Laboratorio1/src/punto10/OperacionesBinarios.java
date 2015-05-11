package punto10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperacionesBinarios {
	public static void main(String args[]) throws IOException { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//declaracion Variable
		int opcion = -1;
		int opcion1 = -1;
		int resultado;
		
		while(opcion != 0){
			//captura de valores a operar
			System.out.println ("Ingrese primer numero binario: ");
			int binario1 = Integer.parseInt(in.readLine(), 2);
			System.out.println ("Ingrese segundo numero binario: ");
			int binario2 = Integer.parseInt(in.readLine(), 2);
			opcion1 = -1;
			
			while(opcion1 != 0){
				System.out.println ("Numeros que se estan operando: "+Integer.toBinaryString(binario1)+" && "+Integer.toBinaryString(binario2) );
				System.out.println ("Seleccione Tipo de operacion"); 
				System.out.println ("---------------------"); 
				System.out.println ("1. Sumar");
				System.out.println ("2. Restar");
				System.out.println ("3. Multiplicar");
				System.out.println ("4. Dividir");
				System.out.println ("5. Cambiar Numeros para operar");
				System.out.println ("0. Salir");
				opcion1 = Integer.parseInt(in.readLine());
					
				//OPERACIONES CON LOS NUMEROS CAPTURADOS
				switch (opcion1){
					case 1: 
						resultado = binario1 + binario2;
						String suma = Integer.toBinaryString(resultado);
						System.out.print("el resultado de sumar los numeros ingresados es: "+suma);
						System.out.println("\n");
					break; 
					case 2: 
						resultado = binario1 - binario2;
						String resta = Integer.toBinaryString(resultado);
						System.out.print("el resultado de restar los numeros ingresados es: "+resta);
						System.out.println("\n");
					break;
					case 3:
						resultado = binario1 * binario2;
						String multiplicacion = Integer.toBinaryString(resultado);
						System.out.print("el resultado de multiplicar los numeros ingresados es: "+multiplicacion);
						System.out.println("\n");
					break; 
					case 4: 
						resultado = binario1 / binario2;
						String division = Integer.toBinaryString(resultado);
						System.out.print("el resultado de dividir los numeros ingresados es: "+division);
						System.out.println("\n");	
					break;
					case 5: 
						opcion1 = 0;
					break; 
					case 0:
						opcion = 0;
						System.out.println ("Adios"); 
					break;
					default: 
						System.out.println ("error"); 
				}
			}	
		}
	}
}
