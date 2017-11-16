public class TablaDeMultiplicar {
	public static void main ( String[] args ){
		int resultado=0;

		for (int i = 0;i < 10 ; i++ ) {
			System.out.println();
			System.out.println("Tabla de multiplicar del "+i);
			System.out.println("===========================");
		
			for ( int  j = 0; j <= 10;j++ ){
				resultado=i*j;
				System.out.println(" " +i+ " * "+j+" = "+resultado+ " ");
			}
		
		}


	}
}