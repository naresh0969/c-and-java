class Car{
    String name="BMW";
    public void change(Car c){
        c.name="Rollce";
    }
}
public class CallByObject {
    public static void main(String args[]){
        Car obj=new Car();
        System.out.println("Before Change "+obj.name);
        obj.change(obj);
        System.out.println("After change "+obj.name);

    }
}
