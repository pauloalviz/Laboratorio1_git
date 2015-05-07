package punto7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalcularVolumen {
	public static void main(String args[]) throws IOException { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int opcion= -1; 

		do{
			try{ 
				System.out.println ("Intoduzca una opción:"); 
				System.out.println ("---------------------"); 
				System.out.println ("1. Calcular Volumen de un cubo"); 
				System.out.println ("2. Calcular Volumen de un cilindro");
				System.out.println ("3. Calcular Volumen de un esfera");
				System.out.println ("4. Calcular Volumen de un cono");
				System.out.println ("0. Salir"); 
				opcion = Integer.parseInt(in.readLine());

				switch (opcion) 
				{ 
					case 1: 
						System.out.println("\n");
						System.out.println ("Ingrese el valor de la arista del cubo");
						double arista = Double.parseDouble(in.readLine());
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
					    double volumenCilindro = alturaCilindro*(Math.PI*Math.pow(radioCilindro, 2));  
					    System.out.println("El volumen de un cilindro con radio de " + radioCilindro + " y con altura de " + alturaCilindro + " es de " + volumenCilindro);
						System.out.println("\n");
					break;
					case 3: 
						System.out.println ("prueba si pulsas 2"); 
					break; 
					case 4: 
						System.out.println ("prueba si pulsas 2"); 
					break; 
					case 0: 
						System.out.println ("Adios"); 
					break; 
					default: 
						System.out.println ("error"); 
				} 
			}
			catch( Exception ex ){ 
					System.out.println("\n\n\n"); 
					System.out.println( "- Error! Numero incorrecto -"); 
					System.out.println("\n\n\n"); 
			}

		}while (opcion!= 0); 
	} 
}

