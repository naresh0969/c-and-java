/*Write a C program to accept batting details information of cricket team using structure.
 it contains player name , runs scored by player.Calculate total runs scored by cricket team*/
 struct cric{
    char name[20];
    int runs;
 };
 #include<stdio.h>
 void main(){
    struct cric team[11];
    int total;
    for(int i=0;i<11;i++){
        printf("Player Name :");
        scanf("%s",team[i].name);
        printf("Runs :");
        scanf("%d",&team[i].runs);
        total+=team[i].runs;
    }
    printf("\n **Cricket team**\n");
    for(int i=0;i<11;i++){
        printf("Name :%s ,Runs :%d\n",team[i].name,team[i].runs);
    }
    printf("\nScore =%d\n",total);
 }