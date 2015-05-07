package punto1;

public class TasaCambio {
	public static void main(String arg[]){
		//declaracion de variales
		double tasaDolar = 1.11808;
		double tasaPeso = 2674.83254;
		double cantidadEuros = 100;
		
		//accion de operaciones de cambio
		double valorDolar = cantidadEuros * tasaDolar;
		double valorPesos = cantidadEuros * tasaPeso;
		
		System.out.println("Euros convertidos: $"+cantidadEuros+"total Dolares: $"+valorDolar+" !! Total Pesos Colombianos: $"+valorPesos);
	}
}
