/*Q4: write a c program to read 3 digit number  and print units place value,
tens place value, hundereds place value.*/
#include<stdio.h>
int main(){
    int num,var,pla=1;
    printf("Enter a 3 digit number :");
    scanf("%d",&num);
    if(num>=100&&num<=999){
        int j = 1;   
        for(int i=0;i<=2;i++){
            var=num%10;
            printf("%d is %d's place\n",var,j);
            j *= 10;
            
            num=num/10;
        }
        
        
        
    }
    else{
        printf("Enter only 3 digit number..!");
    }
    return(0);

}