/** Clase Geometria
 * 	@author Manuel de la Torre
 * @version 1.0
 * */

public class TestGeometria {
  public static void main(String[] args) {
	  
	  double ladoCuadrado=3;
	  double baseTriangulo=4;
	  double alturaTriangulo=5;
	  double baseRectangulo=6;
	  double alturaRectangulo=7;
	  double radioCirculo=8;
	  
	  double resultadoCuadrado = Geometria.areaCuadrado(ladoCuadrado);
	  double resultadoTriangulo = Geometria.areaTriangulo(baseTriangulo,alturaTriangulo);
	  double resultadoRectangulo = Geometria.areaRectangulo(baseRectangulo,alturaRectangulo);
      double resultadoCirculo = Geometria.areaCirculo(radioCirculo);
     
		System.out.println("El area del Cuadrado es " +resultadoCuadrado);
		System.out.println("El area del Triangulo es " +resultadoTriangulo);
		System.out.println("El area del Rectangulo es " +resultadoRectangulo);
		System.out.println("El area del Circulo es " +resultadoCirculo);
  }
}
