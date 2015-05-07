/*
* NOMBRE PROGRAMA: CONVERSOR DE SEGUNDOS A DIAS, HORA, MINUTOS
* AUTOR:PAULO ALVIS
* FECHA: MAY 5 2015
*/
package punto3;

public class ConversorTiempo {
	public static void main(String arg[]){
		//declaracion de variales
		int minuto = 60;
		int hora = 3600;
		int dia = 86400;
		int segundos = 86400;
		
		//accion de operaciones de cambio
		int totalDias = segundos/dia;
		int totalMinutos = segundos/minuto;
		int totalHoras = segundos/hora;
		System.out.println("Segundos Convertidos: "+segundos+" !! dia: "+totalDias+" !! hora: "+totalHoras+" !! minutos: "+totalMinutos);
	}
}
