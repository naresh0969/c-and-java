#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
}*head,*current,*new;
void create(){
    int num;
    printf("Enter -1 to stop");
    scanf("%d",&num);
    head=NULL;
    while(num!=-1){
        if(head==NULL){
            head=current;
        }
        else{
            printf("Enter Data :");
            scanf("%d",&current->data);
            current->next=new;

        }
        
    }
}
void main(){
    int choose;
    do{
        printf("Choose Operation :\n");
        printf("Enter 1 to create linked list :\n");
        printf("2 to display :\n");
        printf("3 to insert begining :\n");
        printf("4 to insert at end");
        printf("5 to insert after node:\n");
        printf("6 to delete begining data:\n");
        printf("7 to delete end data:\n");
        printf("8 to delete node:\n");
        printf("Enter -1 to EXIT ");
        scanf("%d",&choose);

        switch(choose){
        
        case 1:create();
        printf("Linked list is Created :");
        break;
        // case 2:display();
        // break;
        // case 3:insert_beg();
        // break;
        // case 4:insert_end();
        // break;
        // case 5:insert_node();
        // break;
        // case 6:del_beg();
        // break;
        // case 7:del_end();
        // break;
        // case 8:del_node();
        // break;
        case -1:exit;  
    }
    }while(choose!=-1);
    
    



}