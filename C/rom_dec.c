#include<stdio.h>
void main(){
    char rome[10];
    int sum=0;
    printf("give a roman number :");
    scanf("%s",rome);
    for(int i=0;rome[i]!='\0';i++){
        if(rome[i]=='I'){
            if(rome[i+1]=='V'){
                sum+=4;
                i++;
            }
            else if(rome[i+1]=='X'){
                sum+=9;
                i++;
            }
            else{
                sum+=1;
            }
        }
        else if(rome[i]=='V'){
            sum+=5;
        }
        else if(rome[i]=='X'){
            if (rome[i+1]=='L'){
                sum+=40;
            }
            else{
                sum+=10;
            }
            

        }
        else if(rome[i]=='L'){
            sum+=50;
        }
    }
    printf("%d",sum);
}