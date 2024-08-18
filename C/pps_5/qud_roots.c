//Finding roots of a Quadratic equation.

#include<stdio.h>
#include<math.h>
int main(){
    int a,b,c,dis,r1,r2,real,imaginary;
    printf("Enter x^2 cofficient:");
    scanf("%d",&a);
    printf("Enter x cofficient:");
    scanf("%d",&b);
    printf("Enter Constant:");
    scanf("%d",&c);

    dis=b*b-4*a*c;
    

    if(dis>0){
        r1=(-b+sqrt(dis))/(2*a);
        r2=(-b-sqrt(dis))/(2*a);
        printf("The roots of given equation %d,%d",r1,r2);
    }
    else if(dis==0){
        r2=r1=-b/2*a;
        printf("the roots are : %d,%d",r1,r2);
    }
    else{
        real=(-b/(2*a));
        imaginary=(sqrt(-dis))/(2*a);
        printf("root 1= %d +i %d \n",real,imaginary);
        printf("root 2= %d -i %d \n",real,imaginary);
    }
    return(0);
}