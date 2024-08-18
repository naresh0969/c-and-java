/*3. Create an Interface payable with method getAmount ().Calculate the amount to be
paid to Invoice and Employee by implementing Interface. */

interface Payable {
    abstract int getAmount(int value);
}


class Invoice implements Payable{
    private int invoice;
    public int getAmount(int value){
        invoice=value;
        return invoice;
    }

}
class Emp implements Payable{
    private int salary;
    public int getAmount(int value){
        salary=value;
        return salary;
    }
}
public class Bill {
    public static void main(String args[]){
        Invoice obj1=new Invoice();
        System.out.println(obj1.getAmount(100));

    }
}
