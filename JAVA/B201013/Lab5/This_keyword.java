class Add{
    int num;
    int double_num(int num){
        this.num=num;
        return this.num*2;
    }
}
public class This_keyword {
    public static void main(String args[]){
        Add obj=new Add();
        System.out.println(obj.double_num(7));
    }
}
