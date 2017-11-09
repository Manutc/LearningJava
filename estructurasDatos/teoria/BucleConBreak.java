public class BucleConBreak {
	public static void main ( String[] args ){
		int posibleNumeroPrimo = 123131231;
		boolean resultado = false;
		for ( int divisor = 2 ; divisor < posibleNumeroPrimo/2 ; divisor ++ ){
			resultado = posibleNumeroPrimo % divisor == 0;
			 
			if ( resultado == true ){
				System.out.println( "Primer divisor: " + divisor );
				break;
			}
		}
		System.out.println( "¿Es numero primo " + posibleNumeroPrimo + "? "+ !resultado  );
	}
}
