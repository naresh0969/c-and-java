package string;

public class string_buffer {
    public static void main(String args[]){
        //declaration
        StringBuffer name=new StringBuffer();
        System.out.println(name.capacity());
        
        name.append("Naresh");

        name.insert(0,"hello ");
        System.out.println(name);
        
        name.deleteCharAt(4);
        
        name.delete(1,2);
        //all methods of String are applicable
        System.out.println(name.length());
        
    }
    
}
