public class Bucles1 {
	public static void main ( String[] args ){
		int numero = 5;
		int suma = 0;
		int contador = 1;
		while ( contador <= numero ){
			System.out.println( "La suma vale: " + suma + ", contador vale: " +contador);
			suma +=contador;
			contador++;
		}
		System.out.println( "La suma de los " + numero + " numeros vale " + suma);
}
	
	
}
