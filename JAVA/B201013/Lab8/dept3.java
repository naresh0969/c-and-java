import java.util.*;
import dept.cse;
import dept.ece;
import dept.me;
import dept.ce;
class dept3{
    public static void main(String args[]){
        cse a1=new cse();
        ece a2=new ece();
        me a3=new me();
        ce a4=new ce();
        a1.subjects("java", "oops", "dbms");
        a2.ece_sub("dec", "signals", "systems");
        a3.me_sub("fluids", "c", "mechanics");
        a4.ce_sub("graphic", "maths", "geography");
    }
}