// 5. Create an Interface Fare with method getAmount() to get the amount paid for fare
// of travelling. Calculate the fare paid by bus and train implementing interface Fare.

import java.util.*;

public interface fare{
    double getAmount();
}
class bus implements fare{
    private int fare_amount;
   bus(int fare_amount){
        this.fare_amount=fare_amount;
    }
    public  double getAmount(){
        return fare_amount;
    }

}
class train implements fare{
    private int fare_amount;
     train(int fare_amount){
        this.fare_amount=fare_amount;
    }
    public  double getAmount(){
        return fare_amount;
    }
    public static void main(String args[]){
        bus b=new bus(50);
        System.out.println("fare paid by BUS:"+b.getAmount());

          train t=new train(500);
        System.out.println("fare paid by TRAIN:"+t.getAmount());
    }

}
