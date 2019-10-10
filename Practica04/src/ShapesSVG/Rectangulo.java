/**
*Programa para implemnetar un un vector2
* @author Emilio
*
*
**/
package shapesSVG;
public class Rectangulo{
  private Vector2 a;
  private double altura;
  private double ancho;
}
  // Constructores

  public Rectangulo (double altura, double ancho, Vector2 a) {
    this.altura = altura;
    this.ancho = ancho;
    this.a = new Vector2(a.getX(),a.getY());
  }
  
