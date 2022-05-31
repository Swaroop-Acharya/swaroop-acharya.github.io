// Program to covert Celcius to Farenheit
#include<stdio.h>

int main() {
    int celcius;
    int farenhiet;
    printf("Enter the temperature in Celcius:");
    scanf("%d",&celcius);
    farenhiet=(celcius*9/5)+32;
    printf("Temperature in Farenheit is :%d",farenhiet);
 return 0;

}