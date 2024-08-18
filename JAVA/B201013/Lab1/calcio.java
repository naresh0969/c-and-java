
import java.util.*;

class calculate{
    float a, b;

    float sum(){
        return a+b;
    }
    float sub(){
        return a-b;
    }
    float product(){
        return a*b;
    }
    float division(){
        return a/b;
    }
}
public class calcio {

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
       char operator;
        float result;
        calculate operation=new calculate();
        System.out.print("Enter A value :");
        operation.a=scan.nextFloat();
        System.out.print("B value :");
        operation.b=scan.nextFloat();
        System.out.print("Enter operator :");
        operator=scan.next().charAt(0);
        switch(operator){
            case '+':
                result=operation.sum();
                System.out.println(result);
                break;
            case '-':
                result=operation.sub();
                System.out.println(result);
                break;
            case '*':
                result=operation.product();
                System.out.println(result);
                break;
            case '/':
                System.out.println(operation.division());
                break;
            default :System.out.println("Enter valid operator!");
        }
        
        
        scan.close();

    }
}
