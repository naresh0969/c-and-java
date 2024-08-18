import java.util.*;
class equation{
    int a,b,c;
    void roots(){
        int qudrant=(b*b)-(4*a*c);
        int root1,root2;
        if(qudrant==0){
            root1=(int)Math.sqrt(qudrant);
            System.out.print("Real and Equal:");
            System.out.println("Root1 ="+root1+"Root 2 ="+root1);
        }
        else if(qudrant>0){
            
            root1=(-b+((int)Math.sqrt(qudrant)))/(2*a);
            root2=(-b-((int)Math.sqrt(qudrant)))/(2*a);
            System.out.println("root1: "+root1);
            System.out.println("roo2 :"+root2);
        }
        else{
            System.out.println("Imaginary roots !");
        }
    }
}
class qroots{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        equation obj=new equation();
        System.out.println("Enter x2 cofficient :");
        obj.a=scan.nextInt();
        System.out.println("enter x cofficient:");
        obj.b=scan.nextInt();
        System.out.println("enter constant :");
        obj.c=scan.nextInt();
        obj.roots();
        
        scan.close();
        
    }
}