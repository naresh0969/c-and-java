
import java.util.*;

class searching {
    void search(int a[],int size,int key){
        int first=0;
        int last=size-1;
        
        while(first<=last){
            int mid=(first+last)/2;
            if(a[mid]>key){
                last=mid-1;
            }
            if(a[mid]<key){
                first=mid+1;
            }
            if(a[mid]==key){
                System.out.println(key +"is found ");
                return;
            }
            
        }
        System.out.println(key+" is not found");

    }
    
}
public class binary_search {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print( "Enter size");
        int size,key;
        size=scan.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=scan.nextInt();
        }
        System.out.print("Enter key :"); 
        key=scan.nextInt();
        searching bs=new searching();
        bs.search(a,size,key);
        scan.close();


    }
}
