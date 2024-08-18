/*1. Create an abstract class Shape which calculate the area and volume of 2-d and 3-d
shapes with methods getArea() and getVolume(). Reuse this class to calculate the area
and volume of square ,circle ,cube and sphere. */

abstract class Shape {
    abstract float getArea(int side);
    abstract float getVolume(int r);
}

class Square extends Shape {
    float getArea(int side) {
        return side * side;
    }

    float getVolume(int r) {
        System.out.println("No Volume! It is a 2D Shape");
        return 0;
    }
}

class Circle extends Shape {
    float getArea(int side) {
        return (float)(Math.PI*side * side);
    }

    float getVolume(int r) {
        System.out.println("No Volume! It is a 2D Shape");
        return 0;
    }
}

class Sphere extends Shape {
    float getArea(int side) {
        return (float) (4 * Math.PI * side * side);
    }

    float getVolume(int r) {
        return (float) (4.0 / 3.0 * Math.PI * r * r * r);
    }
}

class Cube extends Shape {
    float getArea(int side) {
        return (float) (6*side*side);
    }

    float getVolume(int r) {
        return (float) (r * r * r);
    }
}
public class shapes {
    public static void main(String args[]) {
        Sphere obj1 = new Sphere();
        Square obj2 = new Square();
        Cube obj3=new Cube();
        Circle obj4=new Circle();
        System.out.println("Area of Sphere: " + obj1.getArea(10));
        System.out.println("Volume of Sphere: " + obj1.getVolume(5));
        System.out.println("Area of Square: " + obj2.getArea(5));
        System.out.println("Volume of Square: " + obj2.getVolume(5));

        System.out.println("Area of Circle: " + obj4.getArea(10));
        System.out.println("Volume of Circle: " + obj4.getVolume(5));
        System.out.println("Area of Cube: " + obj3.getArea(5));
        System.out.println("Volume of Cube: " + obj3.getVolume(5));
    }
}