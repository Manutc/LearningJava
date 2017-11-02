public class TestMatematicas {
  public static void main(String[] args) {
	  
	  int numero=170;
	  boolean resultadoUno = Matematicas.esPar(numero);
	  boolean resultadoDos = Matematicas.esDivisiblePorTres(numero);
	  boolean resultadoTres = Matematicas.esDivisiblePorCinco(numero);
    
		System.out.println(numero + " ¿es par? "+resultadoUno);
		System.out.println(numero + " ¿es divisible entre 3? "+resultadoDos);
		System.out.println(numero + " ¿es divisible entre 5? "+resultadoTres);
		
  }
}
