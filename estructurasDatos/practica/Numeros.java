

public class Numeros {
	public static void main ( String[] args ){
		imprimirPrimerosDIezNumeros();
		System.out.println("--------------");
		imprimirDelVeinteAlOchentaDeCincoEnCinco();
		System.out.println("--------------");
		impDeDiezEnDiez();
	}

	public static void imprimirPrimerosDIezNumeros(){
		for (int i = 1 ; i <= 10 ; i++ ){
			System.out.println(i);
		}
	}

	public static void imprimirDelVeinteAlOchentaDeCincoEnCinco(){
		for (int i = 20 ; i <= 80 ; i+=5 ){
			System.out.println(i);
		}
	}

	public static void impDeDiezEnDiez(){
		for (int i = 10 ; i <= 50 ; i+=10 ){
			System.out.println(i);
		}
	}
}