#include<stdio.h>
void main(){
    int fn=0,size,ln,mn,search,arr[20];
    printf("how many elements ?");
    scanf("%d",&size);
    printf("Enter elements :");
    for(int i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    printf("number to search :");
    scanf("%d",&search);
    ln=size-1;
    mn=(fn+ln)/2;
    while(fn<=ln){
        if(arr[mn]<search){
            fn=mn+1;
        }
        else if(arr[mn]==search){
            printf("%d is at %d index.",search,mn);
            break;
        }
        else{
            ln=mn-1;
        }
        mn=fn+ln;
    }
    if(arr[mn]!=search){
        printf("%d is not present in the list.",search);
    }
}