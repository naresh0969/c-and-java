package string;

public class string_basic {
    public static void main(String args[]){
        //Declaration and intialization
        String name="Naresh";
        String surname=" Damera";
        
        //methods
        name.length();
        name.charAt(0);
        name.concat(surname);
       System.out.println(name.contains("ar"));
       System.out.println(name.indexOf("a"));
       System.out.println(name.substring(2,5));
       System.out.println(name.compareTo(surname));
       System.out.println(name.replace("a","s"));
       System.out.println(name.isBlank());
       System.out.println(name.isEmpty());
       System.out.println(name.toLowerCase());
       System.out.println(name.toUpperCase());
       System.out.println();
    }
    
}
