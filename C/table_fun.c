//write a c program to print user entered table using function
#include<stdio.h>
void tab(int num);
int main(){
    printf("Enter a number :");
    int num;
    scanf("%d",&num);
    tab(num);

}
void tab(int num){

    for(int i=1;i<=10;i++){
        printf("%d * %d =%d\n",num,i,num*i);
    }
}