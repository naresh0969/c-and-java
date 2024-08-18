#include<stdio.h>
int fib(int num);
void main(){
    int num;
    printf("Enter series range :");
    scanf("%d",&num);
    for(int i=0;i<num;i++){
        printf("%d ",fib(i));
    }
}
int fib(int num){
    if(num==0||num==1){
        return(num);
    }
    else{
        return(fib(num-1)+fib(num-2));
    }
}