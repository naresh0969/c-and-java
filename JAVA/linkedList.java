fclass node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
class implement{
    node head=null;
    void insert(int data){
        node newnode=new node(data);
        
        if(head==null){
            head=newnode;

        }
        else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

}
public class linkedList {
    public static void main(String args[]){
        implement obj=new implement();
        obj.insert(2);
        obj.insert(5);
        obj.insert(7);
        obj.insert(9);
        obj.print();
    }

    
}
