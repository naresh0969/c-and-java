//Write a C program to find the fibonacii of a number using arrays.
#include<stdio.h>
int main(){
    int arry[50],num,fn=0,sn=1,tn;
    printf("Enter series range :");
    scanf("%d",&num);
    for(int i=0;i<=num;i++){
        tn=fn+sn;
        arry[i]=fn;
        fn=sn;
        sn=tn;
    }
    for(int j=0;j<num;j++){
        printf("%d ",arry[j]);
    }
}
