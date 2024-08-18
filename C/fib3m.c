#include<stdio.h>
void fib(int a);
int fibr(int b);
void main(){
    //using normal form.
    // int range,fn=0,sn=1,tn;
    // printf("Enter series range :");
    // scanf("%d",&range);
    // for(int i=0;i<range;i++){
    //     tn=fn+sn;
    //     printf("%d ",fn);
    //     fn=sn;
    //     sn=tn;
    // }
        //using function
    int num,res;
    printf("Enter range:");
    scanf("%d",&num);
    for(int i=0;i<num;i++){
        printf("%d ",fibr(i));
    }

}
void fib(int a){
    int fn=0,sn=1,tn;
    for(int i=0;i<a;i++){
        tn=fn+sn;
        printf("%d ",fn);
        fn=sn;
        sn=tn;
    }

}
int fibr(int a){
    if(a==0){
        return(0);
    }
    else if(a==1){
        return(1);
    }
    else{
        return(fibr(a-1)+fibr(a-2));
    }
}