/*
* NOMBRE PROGRAMA: VOLUMEN ELEMENTOS
* AUTOR:PAULO ALVIS
* FECHA: MAY 7 2015
*/
package punto7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalcularVolumen {
	public static void main(String args[]) throws IOException { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int opcion= -1; 

		do{
			System.out.println ("Intoduzca una opción:"); 
			System.out.println ("---------------------"); 
			System.out.println ("1. Calcular Volumen de un cubo"); 
			System.out.println ("2. Calcular Volumen de un cilindro");
			System.out.println ("3. Calcular Volumen de un esfera");
			System.out.println ("4. Calcular Volumen de un cono");
			System.out.println ("0. Salir"); 
			opcion = Integer.parseInt(in.readLine());
				
			//OPCIONES DEL MENU DE SELECCION
			switch (opcion){ 
				case 1: 
					System.out.println("\n");
					System.out.println ("Ingrese el valor de la arista del cubo");
					double arista = Double.parseDouble(in.readLine());
					//CALCULO VOLUMEN CUBO
					double volumenCubo = Math.pow(arista, 3);
					System.out.println("El volumen de un cubo de arista " + arista + " es de " + volumenCubo);
					System.out.println("\n");
				break; 
				case 2: 
					System.out.println("\n");
					System.out.println("Ingresa radio del cilindro");  
				    double radioCilindro= Double.parseDouble(in.readLine());
				    System.out.println("Ingresa altura del cilindro");  
				    double alturaCilindro= Double.parseDouble(in.readLine());
				  //CALCULO VOLUMEN CILINDRO
				    double volumenCilindro = alturaCilindro*(Math.PI*Math.pow(radioCilindro, 2));  
				    System.out.println("El volumen de un cilindro con radio de " + radioCilindro + " y con altura de " + alturaCilindro + " es de " + volumenCilindro);
					System.out.println("\n");
				break;
				case 3: 
					System.out.println("\n");
					System.out.println("Ingresa radio de la esfera");  
				    double radioEsfera= Double.parseDouble(in.readLine());
				  //CALCULO VOLUMEN ESFERA
				    double volumenEsfera=(4/3)*Math.PI*(Math.pow(radioEsfera, 3));
				    System.out.println("El volumen de una esfera con radio de " + radioEsfera + " es de " + volumenEsfera);
					System.out.println("\n");
				break; 
				case 4: 
					System.out.println("\n");
					System.out.println("Ingresa radio del cono");  
				    double radioCono= Double.parseDouble(in.readLine());
				    System.out.println("Ingresa altura del cono");  
				    double alturaCono= Double.parseDouble(in.readLine());
				  //CALCULO VOLUMEN CONO
				    double volumenCono = (Math.PI*(Math.pow(radioCono, 2))*alturaCono)/3;  	
				    System.out.println("El volumen de un cono con radio de " + radioCono + " y con altura de " + alturaCono + " es de " + volumenCono);
					System.out.println("\n");
				break; 
				case 0: 
					System.out.println ("Adios"); 
				break; 
				default: 
					System.out.println ("error"); 
			} 
		}while (opcion!= 0); 
	} 
}

