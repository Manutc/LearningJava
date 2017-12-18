import java.util.Arrays;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = new int[10];
		int array2[] = new int[10];
		
		
		//Forma clasica
		for (int i = 0; i < array1.length; i++) {
			array1[i]=3;
		}
		
		for (int i = 0; i < array1.length; i++) {
			System.out.print (","+array2[i]);
		}
		
		//Forma nueva
		Arrays.fill(array2,2);
		System.out.print (Arrays.toString(array1));
		
	}
	
	//Se podria devolver también usando un metodo, que queda más bonico
	public static void mostarArrays(int[] primerArray,int[] segundoArray) {
		if (primerArray.length == segundoArray.length) {
			for (int i = 0; i < segundoArray.length; i++) {
				System.out.println(primerArray[i]+"--"+segundoArray[i]);
		}
	}
	}

}
