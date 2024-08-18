//fibonacci

#include<stdio.h>
int main(){
    int n1=0,n2=1,n3,num;
    printf("Enter no. of fibinocci terms :");
    scanf("%d",&num);
    for(int i=0;i<=num;i++){
        printf("%d,",n1);
        n3=n1+n2;
        n1=n2;
        n2=n3;
    }
    return(0);
}