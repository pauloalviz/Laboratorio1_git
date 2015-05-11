/*
* NOMBRE PROGRAMA: CONVERSOR SISTEMAS NUMERICOS
* AUTOR:PAULO ALVIS
* FECHA: MAY 7 2015
*/
package punto9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConversorSistemasNumericos {
	public static void main(String args[]) throws IOException { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//declaracion Variable
		int opcion= -1;
		String binario, octal, hexa; 
		
		do{
			System.out.println ("Seleccione Tipo de conversion"); 
			System.out.println ("---------------------"); 
			System.out.println ("1. Binario --> Octal");
			System.out.println ("2. Binario --> Hexadecimal");
			System.out.println("\n");
			System.out.println ("3. Octal --> Binario");
			System.out.println ("4. Octal --> Hexadecimal");
			System.out.println("\n");
			System.out.println ("5. Hexadecimal --> Octal");
			System.out.println ("6. Hexadecimal --> Binario");
			System.out.println ("0. Salir"); 
			opcion = Integer.parseInt(in.readLine());
				
			//OPCIONES DEL MENU DE SELECCION
			switch (opcion){
				case 1: 
					System.out.println("\n");
					System.out.print("Ingrese numero Binario: ");
					int binarioOc = Integer.parseInt(in.readLine(), 2);
					octal = Integer.toOctalString(binarioOc);
					System.out.print("El Valor en OCTAL es: "+octal);
					System.out.println("\n");
				break; 
				case 2: 
					System.out.println("\n");
					System.out.print("Ingrese numero Binario: ");
					int binarioHe = Integer.parseInt(in.readLine(), 2);
					hexa = Integer.toHexString(binarioHe);
					System.out.print("El Valor en HEXA es: "+hexa);
					System.out.println("\n");
				break;
				case 3:
					System.out.println("\n");
					System.out.print("Ingrese numero OCTAL: ");
					int octalBin = Integer.parseInt(in.readLine(), 8);
					binario = Integer.toBinaryString(octalBin);
					System.out.print("El Valor en Binario es: "+binario);
					System.out.println("\n");
				break; 
				case 4: 
					System.out.println("\n");
					System.out.print("Ingrese numero OCTAL: ");
					int octalHe = Integer.parseInt(in.readLine(), 8);
					hexa = Integer.toHexString(octalHe);
					System.out.print("El Valor en HEXA es: "+hexa);
					System.out.println("\n");
				break; 
				case 5:
					System.out.println("\n");
					System.out.print("Ingrese numero Hexadecimal: ");
					int hexadecimalOc = Integer.parseInt(in.readLine(), 16);
					octal = Integer.toOctalString(hexadecimalOc);
					System.out.print("El Valor en OCTAL es: "+octal);
					System.out.println("\n");
				break;
				case 6:
					System.out.println("\n");
					System.out.print("Ingrese numero Hexadecimal: ");
					int hexadecimalBin = Integer.parseInt(in.readLine(), 16);
					binario = Integer.toBinaryString(hexadecimalBin);
					System.out.print("El Valor en Binario es: "+binario);
					System.out.println("\n");
				break;
				case 0: 
					System.out.println ("Adios"); 
				break; 
				default: 
					System.out.println ("error"); 
			}
		}while(opcion!= 0);
	}
}
