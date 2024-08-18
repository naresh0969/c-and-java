// 6. Create an Interface StudentFee with method getAmount(),getFirstName(),getLastName(),
// getAddress(), getContact(). Calculate the amount paid by the Hostler and NonHostler
// student by implementing interface Student Fee

import java.util.*;
public interface studentfee{
    int getAmount();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getContact();
    
}
class Hostler implements studentfee{
        private  String first_name, String last_name,String address, String contact;

     Hostler(int amount,String first_name,String last_name,String address,String contact){
        this.amount=amount;
        this.first_name=first_name;
        this.last_name=last_name;
        this.address=address;
        this.contact=contact;

    }
  public  int getAmount(){
        return amount;

    }
   public String getFirstName(){
        return first_name;
    }
  public  String getLastName(){
        return last_name;
    }
   public String getContact(){
        return contact;
    }
   public String getAddress(){
        return address;
    }
    

}
class NonHostler implements studentfee{
    private int amount;
     private  String first_name, String last_name,String address, String contact;
     NonHostler(int amount,String first_name,String last_name,String address,String contact){
        this.amount=amount;
        this.first_name=first_name;
        this.last_name=last_name;
        this.address=address;
        this.contact=contact;

    }
   public int getAmount(){
        return amount;

    }
  public  String getFirstName(){
        return first_name;
    }
  public  String getLastName(){
        return last_name;
    }
  public  String getContact(){
        return contact;
    }
  public  String getAddress(){
        return address;
    }
    

}
class test{
    public static void main(String args[]){

        Hostler hos=new Hostler(10000,"DEEPIKA","KONDAMADUGU","hyd","7036118321");
        System.out.println("___________________________");
        System.out.println("Hostler Details:");
        System.out.println("___________________________");

        System.out.println("Amount paid:"+hos.getAmount());
        System.out.println("full_name:"+hos.getFirstName()+" "+hos.getLastName());
        System.out.println("Addres:"+hos.getAddress());
        System.out.println("Contact:"+hos.getContact()),        
               NonHostler nhos=new  NonHostler(1000,"DEEPu","KONDA","gacchiboli","9912123221");
        System.out.println("___________________________");
        System.out.println("NonHostler Details:");
        System.out.println("___________________________");

        System.out.println("Amount paid:"+nhos.getAmount());
        System.out.println("full_name:"+nhos.getFirstName()+" "+nhos.getLastName());
        System.out.println("Addres:"+nhos.getAddress());
        System.out.println("Contact:"+nhos.getContact());

    }
}