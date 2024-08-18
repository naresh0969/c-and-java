#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
}*head,*first,*second,*third,*newnode,*midnode,*last;
void display(struct node *ptr){
    while(ptr !=NULL){
        printf(" element :%d\n",ptr->data);
        ptr=ptr->next;
    }
}
int main(){
    //assigning data
    head=NULL;
    first=(struct node *)malloc(sizeof(struct node));
    head=first;
    first->data=25;
    second=(struct node *)malloc(sizeof(struct node));
    first->next=second;
    second->data=30;
    third=(struct node *)malloc(sizeof(struct node));
    second->next=third;
    third->data=50;
    third->next=NULL;
    display(head);
    printf("\n");
    //insertion @ the beginning
    newnode=(struct node*)malloc(sizeof(struct node));
    newnode->next=head;
    head=newnode;
    printf("Enter number to insert :");
    scanf("%d",&newnode->data);
    display(head);
    printf("\n");

    //insertion in between nodes
    midnode=(struct node*)malloc(sizeof(struct node));
    //adding @ 3rd node
    midnode->next=second;
    first->next=midnode;
    midnode->data=60;
    display(head);
    printf("\n");

    // insertion @end
    last=(struct node*)malloc(sizeof(struct node));
    third->next=last;
    last->data=100;
    last->next=NULL;
    display(head);

    //Deletion

     

}
