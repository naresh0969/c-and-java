#include<stdio.h>
int main(){
    int num,dv,gcd=0,lcm=1;
    printf("Enter a number :");
    scanf("%d",&num);
    dv=num;
    for(int i=1;num!=1;i++){
        if(num%i==0){
            lcm*=i;
            num/=i;
            if(i>gcd){
                gcd=i;
            }
        }
    }
    printf("LCM of %d :%d\n",dv,lcm);
    printf("GCD is:%d",gcd);
    return(0);
}