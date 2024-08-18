package InnerClasses;

import InnerClasses.Outer.Inner;

class Outer{
    int num=132;
    void show(){
        System.out.println("Outer Class");
    }
    class Inner{
        void show(){
            System.out.println("inner class");
        }
    }
}

public class Member {
    public static void main(String args[]){

        Outer obj=new Outer();
        obj.show();
        Outerobj.Inner in=obj.new Inner();
    }
}
