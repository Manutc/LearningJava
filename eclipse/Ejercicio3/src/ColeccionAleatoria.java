import java.util.Arrays;

public class ColeccionAleatoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = new int[100];
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random()*101);
		}
		System.out.print ("Numeros:"+Arrays.toString(array1));
		System.out.println ("\nMedia: "+valorMedio(array1));
		
	}
	
	public static double valorMedio(int primerArray[]) {
		
		double media = 0;
		for (int i = 0; i < primerArray.length; i++) {
			media += primerArray[i];		
			
		}
		media = media/primerArray.length;
		return media;
		
	}
	
	

}
