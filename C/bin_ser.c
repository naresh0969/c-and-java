#include<stdio.h>
void main(){
    int size,fn=0,ln,mn,search,arr[20];
    printf("how many no.s are to enter :");
    scanf("%d",&size);
    ln=size-1;
    printf("Enter numbers :");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    printf("what number to search :");
    scanf("%d",&search);
    mn=(fn+ln)/2;
    while(1){
        if(arr[mn]<search){
            fn=mn+1;
        }
        else if(arr[mn]==search){
            printf("%d present in index %d",search,mn);
            break;
        }
        else{
            ln=mn-1;

        }
        mn=(fn+ln)/2;
    }

}