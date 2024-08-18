

interface sample {
    int id=1;
    String name="cse";
    void print();
//     void display(){
//         System.out.println("displayed");
//     }
}

interface sample2{
    void print();
    
}
class result implements sample,sample2{
   public void print(){
        System.out.println("interface executed");
    }

}
public class interface_demo {
    public static void main(String args[]){
        result res=new result();
        res.print();
        System.out.println(res.name+" "+res.id);

    }
}
