/*2.A mail-order house sells five products whose retail prices are as follows : Product
1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87 , Product 4 : Rs. 45.50
and Product 5 : Rs. 40.49 . Each product has Prdouct_Id, Product_Name,
Product_Quantity, Product_Price. Write an application that reads a series of pairs of
numbers as follows :
a) product Id
b) quantity sold
your program use a switch statement to determine the retail price for each product.
it should calculate and display the total retail value of all products sold. */

package lab3;
import java.util.*;
class items{
    float price;
    int id;
    String name;
    float calculate(float qty){
        float total=this.price*qty;
        return total;
    }
}

public class product {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        items data[]=new items[3];
        data[0]=new items();
        data[1]=new items();
        data[2]=new items();

        for(int i=0;i<3;i++){
            System.out.print("Product ID :");
            data[i].id=scan.nextInt();
            System.out.print("Product Name: ");
            data[i].name=scan.next();
            System.out.print("Price: ");
            data[i].price=scan.nextFloat();

        }

        int more=1;
        float Amount=0,qty;
        int id;
        System.out.println("Your Purcheses :");
        while(more==1){
            System.out.print("Product Id: ");
            id=scan.nextInt();
            System.out.print("Quantity: ");
            qty=scan.nextFloat();
            for(int i=0;i<3;i++){
                if(id==data[i].id){
                    id=data[i].id;
                }
            }
            switch(id){
                case 1:Amount+=data[0].calculate(qty); break;
                case 2:Amount+=data[1].calculate(qty); break;
                case 3:Amount+=data[2].calculate(qty); break;
            }
            System.out.print("Press 1 to continue:");
            more=scan.nextInt();

        }
        System.out.println("Amount ="+Amount);
        scan.close();

    }
}
