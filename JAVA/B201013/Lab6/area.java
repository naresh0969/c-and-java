//1. Write a Java program to find Area and Circle of different shapes using polymorphism concept
import java.util.Scanner;

class result{
    float PI=3.14f;
    float find_area(int radius){
        return 2*PI*PI;
    }
    float find_area(int length, int breadth){
        return length*breadth;
    }
    
}
public class area {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        result obj=new result();
        int choose;
        int radius;
        int length;
        int breadth;
        System.out.println("choose shape");
        System.out.println("1 for circle:");
        System.out.println("2 for rectangle/square:");
        System.out.println("3 for ");
        choose=scan.nextInt();
        switch(choose){
            case 1: 
            System.out.println("Enter Radius:");
            radius=scan.nextInt();
            System.out.println(obj.find_area(radius));
            break;

            case 2:
            System.out.println("Enter length and breadth");
            length=scan.nextInt();
            breadth=scan.nextInt();
            System.out.println(obj.find_area(length,breadth));
            break;

            default:System.out.println("Choose right optioin");
        }

        scan.close();
    }
    
}
