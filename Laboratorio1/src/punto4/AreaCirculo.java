package punto4;
import java.io.*;

public class AreaCirculo {
	public static void main(String arg[]) throws IOException {
		//declaracion de variales
		double radio = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//captura de Radio ingresado por usuario
		System.out.print("Ingrese la longitud del radio para calcular el area correspondiente en cm: ");
		radio = Double.parseDouble(in.readLine( ));
		
		//accion de operaciones de cambio
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("\n\tArea de Circulo: "+area);
	}
}
