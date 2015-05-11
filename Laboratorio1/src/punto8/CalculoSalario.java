/*
* NOMBRE PROGRAMA: CALCULO DE SALARIOS
* AUTOR:PAULO ALVIS
* FECHA: MAY 7 2015
*/
package punto8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculoSalario {
	public static void main(String args[]) throws IOException { 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//declaracion Variable SalarioCompleto
		double salarioCompleto;
		int opcion= -1;
		
		do{
			System.out.println ("Intoduzca una opción:"); 
			System.out.println ("---------------------"); 
			System.out.println ("1. Calcular Salario Empleado"); 
			System.out.println ("0. Salir"); 
			opcion = Integer.parseInt(in.readLine());
				
			//OPCIONES DEL MENU DE SELECCION
			switch (opcion){
			case 1: 
				//ingreso de sueldo basico
				System.out.println("\n");
				System.out.print("Ingrese Salario base de empleado: ");
				double salarioBase = Double.parseDouble(in.readLine( ));
				
				//calculo de porcentaje de acuerdo a salario
				if(salarioBase >= 1000000){
					salarioCompleto = salarioBase + (salarioBase*3 /100.0);
					System.out.print("Salario con Bonificaciones es de: "+salarioCompleto);
				}else if(salarioBase < 990000 && salarioBase >= 700000){
					salarioCompleto = salarioBase + (salarioBase*5 /100.0);
					System.out.print("Salario con Bonificaciones es de: "+salarioCompleto);
				}else if(salarioBase < 699000 && salarioBase >= 400000){
					salarioCompleto = salarioBase + (salarioBase*7 /100.0);
					System.out.print("Salario con Bonificaciones es de: "+salarioCompleto);
				}else if(salarioBase <= 399000){
					salarioCompleto = salarioBase + (salarioBase*20 /100.0);
					System.out.print("Salario con Bonificaciones es de: "+salarioCompleto);
				}else{
					System.out.print("El salario no tiene bonificaciones");
				}
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
