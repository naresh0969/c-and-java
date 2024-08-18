//Swap two numbers by using call by reference.
#include<stdio.h>
int swap(int *a,int *b);
int main(){
    int a=8;
    int b=4;
    swap(&a,&b);
    printf("a=%d,B=%d",a,b);
    return(0);
}
int swap(int *a,int *b){
    int c=*a;
    *a=*b;
    *b=c;
    printf("A=%d,B=%d ",*a,*b);
}