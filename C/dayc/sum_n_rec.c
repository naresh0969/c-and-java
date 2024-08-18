// find the sum n natural number using recurssion
#include<stdio.h>
int sum(int a);
int main(){
    int num,res=0;
    printf("Enter N value :");
    scanf("%d",&num);
    printf("%d",sum(num));
}
int sum(int a){
    if(a!=0){
        return(a+sum(a-1));
    }
    else{
        return(a);
    }
}