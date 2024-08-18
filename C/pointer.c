#include<stdio.h>
int main(){
    int num=34;
    int *ptr=&num;
    int num2=&ptr;
    printf("%u\n",num);
    printf("%u\n",&ptr);
    // printf("%u",num2);
}