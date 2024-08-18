public class inheritence {
    public static void main(String args[]){
        frog a1=new frog();
        a1.eats();
        a1.color="black";
        System.out.println(a1.color);

    }
    
}
class animal{
    String color;
    void eats(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}
class frog extends animal{
    String type;
    void swim(){
        System.out.println("swims");
    }
}
