#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
}*start,*current,*temp;
int main(){
    int val=1;
    
     while(1){
        if(val==1){
            start=(struct node*)malloc(sizeof(struct node));
            scanf("%d",&start->data);
            start->next=NULL;
            temp=start;
        }
        else if(val==-1){
            break;
        }
        else{
            current=(struct node*)malloc(sizeof(struct node));
            scanf("%d",&current->data);
            temp->next=current;
            current->next=NULL;
            temp=current;
        }
        printf("exit -1 to exit=");
        scanf("%d",&val);
     }
}