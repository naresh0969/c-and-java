class Vehicle{
    public Vehicle(int model){
        System.out.println("Model:"+model);
    }
}
class Car extends Vehicle{
    public Car(int year){
        super(256);
        System.out.println("Year :"+year);
    }


}



public class Super{
    public static void main(String args[]){
        Car obj=new Car(2020);
    }
}