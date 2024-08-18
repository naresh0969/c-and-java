// 2. Create an abstract class Employee with methods getAmount() which displays the
// amount paid to employee. Reuse this class to calculate the amount to be paid to
// WeeklyEmployeed and HourlyEmployee according to no. of hours and total hours
// for HourlyEmployee and no. of weeks and total weeks for WeeklyEmployee.


import java.util.*;
abstract class Employee{
    public abstract double getAmount();
}
class WeeklyEmployee extends Employee{
     private int weeks;
     private double amount;
     public WeeklyEmployee(int weeks,double amount){
        this.weeks=weeks;
        this.amount=amount;
     }
    public double getAmount(){
        return amount/weeks;
     }

}
class HourlyEmployee extends Employee{
     private int hours;
     private double amount;
     public HourlyEmployee(int hours,double amount){
        this.hours=hours;
        this.amount=amount;
     }
    public double getAmount(){
        return amount/hours;
     }

}
class test{
    public static void main(String args[]){
        WeeklyEmployee week=new WeeklyEmployee(4,30000);
        System.out.println("the amount paid to WeeklyEmployee:"+week.getAmount());


               HourlyEmployee hour =new HourlyEmployee(25,1000);
        System.out.println("the amount paid to HourlyEmployee:"+hour.getAmount());

    }

} 