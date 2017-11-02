/** Clase Geometria
 * 	@author Manuel de la Torre
 * @version 1.0
 * */

public class Geometria {
  
	
  public static double areaCuadrado( double ladoCuadrado){
	   return ladoCuadrado * ladoCuadrado;
  }
  
  public static double areaTriangulo(double baseTriangulo, double alturaTriangulo){
	   return (baseTriangulo * alturaTriangulo)/2;
  }
  
  public static double areaRectangulo (double baseRectangulo, double alturaRectangulo){
	   return baseRectangulo * alturaRectangulo;
  }
  public static double areaCirculo (double radioCirculo){
	
	   return radioCirculo * Math.PI;
  }

}
