/* Implement the following case study using OOP concepts in Java.
E-Book stall :
Every book has Properties which includes : Book _Name, Book_Author, Book_Count ;
Every Customer is having properties as : Customer_Id, Customer_Name,
Customer_Address and he can buy Books from E-Book stall.
Write a Program which will display the text book name and the remaining count of text
books when a customer buys a text book. */

package lab3;
import java.util.*;
class book{
    String book_name,book_author;
    int book_count,book_id;
}
class customer{
    String customer_name,customer_address;
    
}
public class book_stall {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("How many types of book are there? ");
        int max=scan.nextInt();
        book list[]=new book[max];
        for(int i=0;i<max;i++){
            list[i]=new book();
        }

        System.out.println("Enter book details :");

        for(int i=0;i<max;i++){
            System.out.print("Book id :");
            list[i].book_id=scan.nextInt();
            System.out.print("Book name :");
            list[i].book_name=scan.next();
            System.out.print("Author :");
            list[i].book_author=scan.next();
            System.out.print("This books' count :");
            list[i].book_count=scan.nextInt();

        }

        System.out.println("Customer Details :");

        int end=1,id;
        customer data[]=new customer[100];
        for(int i=0;end!=0;i++){
            data[i]=new customer();
            System.out.print("Customer Name :");
            data[i].customer_name=scan.next();
            System.out.print("Address :");
            data[i].customer_address=scan.next();
            System.out.print("Buying book id :");
            id=scan.nextInt();
            for(int j=0;j<max;j++){
                if(list[j].book_id==id){
                    System.out.print("How many books you want? ");
                    int count=scan.nextInt();
                    list[j].book_count-=count;
                    if(list[j].book_count<=0){
                        System.out.println("Sorry, This book is out of stock !");
                    }
                    else{
                        System.out.println("Book Name: "+list[j].book_name+" ,Left Over ="+list[j].book_count);
                        break;
                    }
                }
            }
            System.out.println("Enter 0 if completed !");
            end=scan.nextInt();
        }


        scan.close();

    }
}
