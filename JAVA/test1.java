import java.util.Scanner;
class Circle{
    double r;
    double area(){
        return Math.PI*r*r;
    }
    double perimeter(){
        return 2*Math.PI*r;
    }
}
public class test1 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.print((char)(65+i )+ " ");
        }
        scan.close();

    }
}
