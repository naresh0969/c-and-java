//Q2 : print size of all data types using sizeof() function
#include<stdio.h>
int main(){
    char d;
    int a;
    float b;
    double c;
    printf("size of character is %d\n",sizeof(d));
    printf("size of integer is %d\n",sizeof(a));
    printf("size of float is %d\n",sizeof(b));
    printf("size of double is %d\n",sizeof(c));
    return(0);
}