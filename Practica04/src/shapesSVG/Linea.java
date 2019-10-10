/**
*Programa para implemnetar un un vector2
* @author Emilio
*
*
**/
package ShapesSVG;
public class Linea{
  private Vector2 P;
  private Vector2 Q;
  private double longitud;

  // Constructores

  public Vector2(Vector2 A, Vector2 B) {
    this.P=new Vector2(A);
    this.Q=new Vector2(B);
    this.longitud=A.distancia(B);
  }
  
}
