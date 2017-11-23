import java.util.Scanner;

public class HoraValida {
	public static void main ( String[] args ){
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce la hora");
		int hora = in.nextInt();
		if ( hora < 0 || hora > 23){
			System.out.println("No es una hora valida");
			return;
			//el return se sale del metodo, al estar en el metodo main terminaria la ejecucion
		}
		String sHora;
		if (hora < 10){
			sHora = "0" + hora;
		} else {
			sHora = hora +"";
		}

		 System.out.println("Introduce los minutos");
		 int minutos = in.nextInt();
		 if ( minutos < 0 || minutos > 59 ){
		 	System.out.println("Minutos no validos");
		 	return;
		 }
		 String sMinutos;
		if (minutos< 10){
			sMinutos = "0" + minutos;
		} else {
			sMinutos = minutos +"";
		}

		 System.out.println("Introduce los segundos");
		 int segundos = in.nextInt();
		
		 if ( segundos < 0 || segundos > 59 ){
		 	System.out.println("Segundos no validos");
		 	return;
		 }
		 String sSegundos;
		if (segundos < 10){
			sSegundos = "0" + segundos;
		} else {
			sSegundos = segundos +"";
		}
		 in.close();
		 System.out.println ("Hora: "+sHora+":"+sMinutos+":"+sSegundos);

	}
}