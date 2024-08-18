package inter;
interface animal{
    public void makeSound();
}
interface bird{
   public  void sound();
}public class dog implements animal{
    public void makeSound(){
        System.out.println("bow-bow");
    }
}