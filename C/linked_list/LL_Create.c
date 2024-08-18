#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
}*head,*newnode,*temp;
void main(){
    head=NULL;
    int choice;
    choice=1;
    while(choice){
        newnode=(struct node*)malloc(sizeof(struct node));
        printf("Enter data :");
        scanf("%d",&newnode->data);
        newnode->next=NULL;
        if(head==NULL){
            head=newnode=temp;
        }
        else{
            temp->next=newnode;
        }
        temp=newnode;
        printf("Enter 0 to EXIT :");
        scanf("%d",&choice);
    }
}