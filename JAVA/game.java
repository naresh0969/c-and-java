import java.util.Scanner;
public class game {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number (1-100)");
        int mynumber=(int)(Math.random()*100);
        int number;
        do{
            number=sc.nextInt();
            System.out.print("Your number :");
            System.out.println(number);
            if(number==mynumber){
                System.out.println("Correct");
            }
            else if(number>mynumber){
                System.out.println("Your number is Larger");
            }
            else if(number<mynumber){
                System.out.println("Your number is smaller");
            }
        }while(number>0);
        System.out.println("My number :");
        System.out.println(mynumber);
        sc.close();

    }
    
}
