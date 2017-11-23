import java.util.Scanner;

public class Cifras {
	public static void main ( String[] args ){
		System.out.println("Introduce un numero de tres cifras");
		Scanner sc = new Scanner(System.in);
		int nTresCifras = sc.nextInt();
		//es una buena practica cerrar el scanner cuando dejes de usarlo
		// de esta forma no ocupa espacio en el monticulo
		sc.close();
		//comprobamos si es negativo y lo cambiamos a positivo
		if ( nTresCifras < 0 ) {
			nTresCifras *=- 1;
		}
		//comprobamos si es de tres cifras
		if ( nTresCifras < 100 || nTresCifras > 999 ) {
			System.out.println("No es un numero de tres cifras");
		} else {
			System.out.println("Es un numero de tres cifras");
			//convertir a cadena, para poder recorrer los tres caracteres
			//Truco: concatenar el int a cadena vacía
			String nCadena = nTresCifras + ""; //casting a cadena
			for ( int i = 0; i < 3 ; i++ ){
				System.out.println ( "Cifra: " + nCadena.charAt(i));
			}
		}
	}
}