// covert the case into lower to upper and upper to lower case
#include<stdio.h>
int main(){
    printf("enter a charecter :");
    char alp,falp;
    scanf("%c",&alp);
    if((alp>=65)&&(alp<=90)){
        falp=alp+32;
        printf("after convertion %c: ",falp);
        
    }
    else if((alp>=97)&&(alp<=122)){
        falp=alp-32;
        printf("after convertion %c",falp);
    }

    
    
    return(0);
}