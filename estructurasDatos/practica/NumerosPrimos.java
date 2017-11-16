public class NumerosPrimos {
	public static void main ( String[] args ){
		int primo=84_979;
		
		if( primo%2 == 0 | primo%3 == 0 | primo%5 == 0 ){
			System.out.println("No es un numero primo1");
		}else if((Math.pow(primo,2) - Math.sqrt(primo)) != 0 ){
			for(int i=2; i < primo ; i++){
				if(i == (2|3|5))
					continue;
					
				if(primo%i==0){
					System.out.println("No es un numero primo2");	
				}else{
					System.out.println("Es un numero primo");
					break;
				}
			}
		}

	}
}