public class BuclesWhile{
	public static void main ( String[] args ){
		int numero = 10;
		int contador1 = 0;
		while ( contador1 < numero ){
			System.out.println( contador1 );
			contador1++;
		}
		
		int contador2 = 0;
		do {
			System.out.println( contador2 );
			contador2++;
			} while ( contador2 < numero );
			
			System.out.println( "Contador1: " +contador1 );
			System.out.println( "Contador2: " +contador2 );
	}
}
