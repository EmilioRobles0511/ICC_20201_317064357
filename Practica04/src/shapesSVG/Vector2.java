/**
*Programa para implemnetar un un vector2
* @author Emilio
*
*
**/
package ShapesSVG;
public class Vector2{
    public double x;
    public double y;
    public double magnitud;

    //Constructores

    public Vector2(double x, double y){
      this.x = x;
      this.y = y;
      this.magnitud = 0.0;
    }
    public Vector2(){
      this.x = 0.0;
      this.y = 0.0;
      this.magnitud= 1.0;
    }
    public void setMagnitud(double mag) {
      this.magnitud = mag;
    }
    public double getX() {
      return this.x;
    }
    public double getY() {
      return this.y;
    }
    public double distancia(Vector2 otro){
      double aux=Math.sqrt((Math.pow((this.getX()-otro.getX()), 2)+(Math.pow((this.getY()-otro.getY()), 2))));
    //}
    //public String toSVG(){
          //return  "String r = <circle cx='"Double.toString(this.x)"' cy='"Double.toString(this.y)"' r='"Double.toString(this.magnitud)"' fill='RoyalBlue' />";
  //  }
    public String toString(){
      return "("+this.getX()+", "+this.getY()+")";
    }
    public boolean equals(Vector2 otro){
      if (this.getX()==otro.getX()) {
        if (this.getY()==otro.getY()) {
          return true;
        } else return false;
      }
  //  }
  }
