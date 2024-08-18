// C program to print fibonacci series of nth term.
#include<stdio.h>
void main(){
    int num,fn=0,sn=1,tn;
    printf("Enter range :");
    scanf("%d",&num);
    printf("0 1 ");
    for(int i=0;i<num-2;i++){
        
        tn=fn+sn;
        printf("%d ",tn);
        fn=sn;
        sn=tn;
    }
}