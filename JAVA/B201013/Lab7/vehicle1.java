// 4. Create an Interface Vehicle with method getColor(),getNumber(), getConsumption()
// calculate the fuel consumed, name and color for TwoWheeler and Four Wheeler By
// implementing interface Vehicle.

public interface vehicle1{
    String getColor();
   String getName();
    double getConsumption();

}
class TwoWheeler implements vehicle1{
    private int fuel_consumed;
    private String name,color;
    public TwoWheeler(int fuel_consumed,String name, String color){
        this.fuel_consumed=fuel_consumed;
        this.name=name;
        this.color=color;

    }
    public double getConsumption(){
        return fuel_consumed;
    }
     public   String getColor(){
        return color;
    }
  public    String getName(){
        return name;
    }
}
class FourWheeler implements vehicle1{
    private int fuel_consumed;
    private String name,color;
    public  FourWheeler(int fuel_consumed,String name, String color){
        this.fuel_consumed=fuel_consumed;
        this.name=name;
        this.color=color;

    }
  public   double getConsumption(){
        return fuel_consumed;
    }
  public   String getColor(){
        return color;
    }
  public    String getName(){
        return name;
    }

    public static void main(String args[]){
        TwoWheeler two=new TwoWheeler(24,"bike","GREEN");
        System.out.println("fuel consumed by two_vehicle "+two.getName()+" of color "+two.getColor()+" is: "+two.getConsumption());


         FourWheeler Four=new FourWheeler(22,"car","RED");
        System.out.println("fuel consumed by four_vehicle "+Four.getName()+" of color "+Four.getColor()+" is: "+Four.getConsumption());
        
    }
    
} 
