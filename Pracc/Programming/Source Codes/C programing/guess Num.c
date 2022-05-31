#include<stdio.h>
#include<time.h>
#include<stdlib.h>
int main(){
   srand(time(0));
   int number ,guessno;
   int guess=1;
    number=rand()%10+1;
    printf("Guess Begins ......./\n");
    do{
            printf("Guess the number between 1 and 10\n");
            scanf("%d", &guessno);
        if(guessno>number){
            printf("Guessed number is high !!!\n");
        }else if(guessno<number){
            printf("Guessed number is low!!!\n");

        }else if(number==guessno){

        printf("Guessed in %d chances\n",guess);
        }
        guess++;
        
    }while (number!=guessno);
    {
        /* code */
    }
    
    return 0;
}