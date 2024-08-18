public class poly {
    public static void main(String args[]){
        deer a2=new deer();
        a2.eat();

    }
    
}
class animal{
    void eat(){
        System.out.println("eats anything");

    }
}
class deer extends animal{
    void eat(){
        System.out.println("eats grass");
    }
}
