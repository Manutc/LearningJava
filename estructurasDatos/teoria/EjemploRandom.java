public class EjemploRandom {
  public static void main(String[] args) {
	  
	  int numero = (int) (Math.random() * 10_000);
	  if( numero % 2 == 0){
		  System.out.println(numero + " es par");	  
	  } else{
		  System.out.println(numero + " es impar");		  
	  }
  }
}
