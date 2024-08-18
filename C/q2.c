#include<stdio.h>
#include<math.h>
int main(){
    printf("Finding roots of a Quadratic Equation\n");
    float a,b,c,dis,d,d2,r1,r2;
    printf("Enter x^2 Cofficient :");
    scanf("%f",&a);
    printf("Enter x Cofficient :");
    scanf("%f",&b);
    printf("Enter Constant :");
    scanf("%f",&c);

    dis=(b*b)-(4*a*c);
    d=sqrt(dis);
    if(dis>0){
        r1=(-b+d)/(2*a);
        r2=(-b-d)/(2*a);
        printf("The roots of given Equation are :%f,%f",r1,r2);
        
    }
    else if(dis==0){
        r1=(-b+d)/(2*a);
        printf("The roots of given Equation are :%f",r1);
    }
    
    else {
        d2=sqrt(4*a*c-b*b);
        r1=(-b+d2)/2*a;
        r2=(-b-d2)/2*a;
        printf("The roots of given Equation are :%d,%d",r1,r2);
    }

}