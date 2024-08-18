#include<stdio.h>
int power(int a,int b);
void main(){
    int base,exp,res;
    printf("Enter Base no. :");
    scanf("%d",&base);
    printf("Enter Exponent :");
    scanf("%d",&exp);
    res=power(base,exp);
    printf("%d",res);
}
int power(int a,int b){
    if(b==1){
        return(a);
    }
    else{
        return(a*power(a,b-1));
    }
}