/*3. Write an application to create a super class Employee with information first name
& last name and methods getFirstName(), getLastName() derive the sub-classes
ContractEmployee and RegularEmployee with the information about department,
designation & method displayFullName() , getDepartment(), getDesig() to print the
salary and to set department name & designation of the corresponding sub-class
objects respectively. */

import java.util.Scanner; 
class Employee{
    String fname;
    String lname;
    String getfname(){
        return fname;
    }
    String getlname(){
        return lname;
    }
}
class ContractEmployee extends Employee{
    String dept;
    String desig;
    String fullname(){
        return (fname+" "+lname);
    }
    String getdept(){
        return dept;
    }
    String getdesig(){
        return desig;
    }
}

class RegularEmployee extends Employee{
    String dept;
    String desig;
    String fullname(){
        return (fname+" "+lname);
    }
    String getdept(){
        return dept;
    }
    String getdesig(){
        return desig;
    }
}
public class Emp {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        ContractEmployee cobj=new ContractEmployee();
        RegularEmployee robj=new RegularEmployee();
        System.out.println("Enter Regular Employee Details :");
                System.out.println("Employee First name :");
                robj.fname=scan.next();
                System.out.println("Employee last name :");
                robj.lname=scan.next();
                System.out.println("Department :");
                robj.dept=scan.next();
                System.out.println("Designation :");
                robj.desig=scan.next();

        System.out.print("\nEnter Contract Employee Details :");
                System.out.println("Employee First name :");
                cobj.fname=scan.next();
                System.out.println("Employee last name :");
                cobj.lname=scan.next();
                System.out.println("Department :");
                cobj.dept=scan.next();
                System.out.println("Designation :");
                cobj.desig=scan.next();
            
        System.out.println("\nContract Employee Details :");
        System.out.println("\nFirst name :" +cobj.getfname());
        System.out.println("Last name :"+cobj.getlname());
        System.out.println("Full name :"+cobj.fullname());
        System.out.println("Department :"+cobj.getdept());
        System.out.println("Designation :"+cobj.getdesig());

        System.out.println("\nRegular Employee Details :");
        System.out.println("First name :" +robj.getfname());
        System.out.println("Last name :"+robj.getlname());
        System.out.println("Full name :"+robj.fullname());
        System.out.println("Department :"+robj.getdept());
        System.out.println("Designation :"+robj.getdesig());
        scan.close();
    }
}
