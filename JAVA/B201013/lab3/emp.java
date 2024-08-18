/*1. Write a program to display details of the required employee based on his Id.
The details of employee includes, Emp_name, Emp_age, Emp_gender, Emp_designation,
Emp_salary, Emp_Address etc.,
*/
package lab3;
import java.util.*;
class employee {
    int id,age,salary;
    String name,gender,desig,address;
    void show(){
        System.out.println("Name :"+name+", Age: "+age+" Gender: "+gender+" Designation : "+desig+" Salary: "+salary);
    }
}

public class emp{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        employee d[]=new employee[2];
        d[0]=new employee();
        d[1]=new employee();
        // d[2]=new employee();
        // d[3]=new employee();
        // d[4]=new employee();

        for(int i=0;i<2;i++){
            System.out.println("Employee "+(i+1)+" details");
            System.out.print("enter id:");
            d[i].id=scan.nextInt();

            System.out.print("Name :");
            d[i].name=scan.next();

            System.out.print("Age :");
            d[i].age=scan.nextInt();
            System.out.print("Gender :");
            d[i].gender=scan.next();
            System.out.print("Designation :");
            d[i].desig=scan.next();
            System.out.print("Salary:");
            d[i].salary=scan.nextInt();

            
            System.out.print("Address :");
            d[i].address=scan.next();

        }
        int key,flag=0;
        System.out.println("Give an ID to check");
        key=scan.nextInt();
        for(int i=0;i<2;i++){
            if(d[i].id==key){
                d[i].show();
                flag=1;
            }
            
        }
        if(flag==0){
            System.out.println("Id not found");
        }
        scan.close();
    }
}
