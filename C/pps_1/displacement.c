
#include<stdio.h> // find time s=1/2at^2
#include<math.h>
int main(){
    float s,a,t;
    a=9.8;
    printf("enter displacement :");
    scanf("%f",&s);
    t=((2*s)/a);
    float t2=sqrt(t);
    printf("the take time is %f seconds",t2);
    return(0);


}