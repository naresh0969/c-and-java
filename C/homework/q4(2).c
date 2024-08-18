/*Q4: write a c program to read 3 digit number  and print units place value,
tens place value, hundereds place value.*/
#include<stdio.h>
int main(){
    int num,var;
    printf("Enter a 3 digit number :");
    scanf("%d",&num);
    if(num>=100&&num<=999){
        int arr[3]={};
        for(int i=0;i<=2;i++){
            var=num%10;
            arr[i]=var;
            num=num/10;
        }
        printf("%d is in once's place\n",arr[0]);
        printf("%d is in ten's place\n",arr[1]);
        printf("%d is in hundered's place\n",arr[2]);
        
        
    }
    else{
        printf("Enter only 3 digit number..!");
    }
    return(0);

}
