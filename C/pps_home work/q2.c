//2. Write a C program to count the number of digits of a positive integer

#include<stdio.h>
int main(){
    int num,count=0;
    printf("Enter number :");
    scanf("%d",&num);
    if(num>0){
        for(int i=0;;i++){
            if(num>=0 && num<=9){
                break;
            }
            if(num%10>=0){
                count++;
            }
            num=num/10;
        }
        printf("Entered %d digit number ",count+1);
    }
    else{
        printf("Enter valid number!");
    }
}