/**
*Programa para implemnetar un un vector2
* @author Emilio
*
*
**/
package shapesSVG;
public class circulo{
  private Vector2 centro;
  private double radio;
  private double perimetro;
  private double area;

  // Constructores
  public circulo(){
    this.radio = 1;
    this.centro = new Vector2(0,0);
    this.area = Math.PI;
  }
  public circulo(Vector2, centro, double radio){
    this.centro = centro;
    this.radio = radio;
    this.area = Math.PI * this.radio * this .radio;
  }
  public String toSVG(){
    return 
  }

}
