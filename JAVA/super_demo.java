/*Create a superclass Vehicle with a parameterized constructor that 
initializes the model attribute. Then, create a subclass Car that 
extends Vehicle and adds its own attribute year. Implement the Car 
constructor to call the Vehicle constructor using super and initialize 
the year attribute. */

class Vehicle{
    public Vehicle(int model){
        System.out.println("Model:"+model);
    }
}
class car extends Vehicle{
    public car(int year){
        super(year);
        System.out.println("Year :"+year);
    }


}



public class super_demo{
    public static void main(String args[]){

    }
}