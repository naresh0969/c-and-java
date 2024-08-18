#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *pre,*next;

}*head,*temp,*newnode;
void main(){
    head=NULL;
    int val=1;
    while(val!=-1){
        newnode=(struct node*)malloc(sizeof(struct node));
        printf("Enter data :");
        scanf("%d",&newnode->data);
        newnode->pre=NULL;
        newnode->next=NULL;

        if(head==NULL){
            head=temp=newnode;
        }
        else{
            temp->next=newnode;
            newnode->pre=temp;
            temp=newnode;
        }
        printf("Enter -1 to EXIT! ");
        scanf("%d",&val);
    }
    while(newnode->next!=NULL){
        
    }
}