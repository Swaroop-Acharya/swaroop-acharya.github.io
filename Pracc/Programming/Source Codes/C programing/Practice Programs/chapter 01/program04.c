// Program to find Simple Intrest
#include <stdio.h>

int main()
{
    int Principle, simpleIntrest ,years;
    float rate;
    printf("Enter the Amount:");
    scanf("%d", &Principle);
    printf("Enter the rate:");
    scanf("%f",&rate);
    printf("Enter the year:");
    scanf("%d",&years);
    simpleIntrest = (Principle * rate * years) / 100;
    printf("Simple intrest is:%d", simpleIntrest);
    return 0;
}