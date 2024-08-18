//Checking a number is Armstrong number or not.
//The number which is equal to  the sum of n power of it's digits .where,n is number of digits in that given number is known Armstrong Number.
//ex: 1634=1^4+6^4+3^4+4^4
#include<stdio.h>
#include<math.h>
int main(){
    int num,size=0,sum=0,dup1,dup2,rem,powe;
    printf("Enter Number :");
    scanf("%d",&num);
    dup1=num;
    dup2=num;
    for(int i=0;num!=0;i++){
        size++;
        num/=10;

    }
    for(int j=0;dup1!=0;j++){
        rem=dup1%10;
        powe=pow(rem,size);
        sum+=powe;
        dup1/=10;
    }
    if(sum==dup2){
        printf("Amstrong Number !");
    }
    else{
        printf("Not a Amstrong Number !");
    }


}