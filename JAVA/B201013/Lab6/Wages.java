/*4. Derive sub-classes of ContractEmployee namely HourlyEmployee & WeeklyEmployee
with information number of hours & wages per hour, number of weeks & wages per
week respectively & method calculateWages() to calculate their monthly salary. Also
override getDesig () method depending on the type of contract employee. */

import java.util.Scanner;
class ContractEmployee{
    String desig="Regular";
    int hrs;
    int hr_wages;
    int weeks;
    int w_wages;
    int salary;
}
class Hourly extends ContractEmployee{
    int getwage(){
        salary=30*hrs*hr_wages;
        return salary;
    }
    void designation(){
        System.out.println("Designation Overrided !");
        desig="Contract";
        System.out.println("Designation: "+desig);
    }
}
class Weekly extends ContractEmployee {
    int getwage(){
        salary=weeks*w_wages;
        return salary;
    }
    void designation(){
        System.out.println("Designation Overrided !");
        desig="Regular";
        System.out.println("Designation: "+desig);
    }
    
}

public class Wages{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        Hourly hobj=new Hourly();
        Weekly wobj=new Weekly();
        int run=0;
        while(run!=1){
            System.out.println("Enter H for hourly W for Weekly");
            char type=scan.next().charAt(0);
            if(type=='H'||type=='h'){
                System.out.println("Hours of work per day :");
                hobj.hrs=scan.nextInt();
                System.out.println("Wage per hour :");
                hobj.hr_wages=scan.nextInt();
                System.out.println("Monthly income ="+hobj.getwage());
            }
            else if(type=='W'||type=='w'){
                System.out.println("Number of Weeks works in a month:");
                wobj.hrs=scan.nextInt();
                System.out.println("Wage per week :");
                wobj.w_wages=scan.nextInt();
                System.out.println("Monthly income ="+wobj.getwage());
            }
            System.out.println("enter 1 to exit");
            run=scan.nextInt();
        }
        scan.close();
    }
}