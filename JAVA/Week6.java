import java.util.Scanner;
class Shape {
  public double getArea(){
    return 0;
  }
 }

class Circle extends Shape {
  private double radius;
  Circle(double radius){
   this.radius=radius;
  }
public double getArea(){
 return 3.14*radius*radius;
 }
}

class Rectangle extends Shape {
  private double l,b;
  //private double b;
 Rectangle(double l,double b){
   this.l=l;
   this.b=b;
  }
 public double getArea(){
   return l*b;
  }
 }

class Week6 {
 public static void main(String[] args){
  Scanner scan=new Scanner(System.in);
  double radius=scan.nextDouble();
  Circle c = new Circle(radius);
  Rectangle r = new Rectangle(3,5);
  System.out.println(r.getArea());
  System.out.println(c.getArea());
  scan.close();
  //System.out.println(Circle);
  //System.out.println(Rectangle);
  }
 }