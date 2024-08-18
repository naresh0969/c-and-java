
abstract class mobile{
    public abstract void call();
    void message(){
        System.out.println("can message");
    }
}

class nokia extends mobile{
    public void call(){
        System.out.println("can make a call");
    }
}

abstract class smartPhone extends nokia{
    public abstract void internet();
}
class updatedMobile extends smartPhone{
    public void internet(){
        System.out.println("can provide internet");
    }
    
}
public class abstraction {
    public static void main(String args[]){
        nokia mobile=new nokia();
        mobile.call();
        mobile.message();

        updatedMobile newMob=new updatedMobile();
        newMob.internet();

    }
}
