//Print the fibanocii series of n range using recursion
#include<stdio.h>
int fib(int a);
int main(){
    int num,res,arr[100];
    printf("Enter Range :");
    scanf("%d",&num);
    for(int i=0;i<num;i++){
        arr[i]=fib(i);
    }
    for(int i=0;i<num;i++){
        printf("%d ",arr[i]);
    }

}
int fib(int a){
    if(a==0||a==1){
        return(a);
    }
    else{
        return(fib(a-1)+fib(a-2));
    }
}