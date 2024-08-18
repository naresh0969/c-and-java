/*2. Write an application that prompts the user for the radius of a circle and uses a
method called circleArea to calculate the area of the circle and uses a method
circlePerimeter to calculate the perimeter of the circle */
import java.util.*;

class Circle1
{
	public double circleArea(double radius)
	{
		return Math.PI*radius*radius;
	} 
	public double circlePerimeter(double radius)
	{
		return 2*Math.PI*radius;
	}
}

public class Circle{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		double radius;
		System.out.println("Enter radius of the Circle:");
		radius=scan.nextDouble();
		Circle1 c=new Circle1();
		System.out.println("The Area of the Circle is:"+c.circleArea(radius));
		System.out.println("The Perimeter of the Circle is:"+c.circlePerimeter(radius)); 
		scan.close();
	}
}
