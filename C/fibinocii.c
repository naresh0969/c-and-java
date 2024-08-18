#include<stdio.h>
int main(){
    int num,fn=0,sn=1,tn;
    printf("Enter number of fibnocii elements :");
    scanf("%d",&num);
    for(int i=0;i<num;i++){    
        tn=fn+sn;
        printf("%d,",fn);
        fn=sn;
        sn=tn;
    }
}