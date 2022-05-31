// Program to find the area of a rectangle by taking inputs from the user

#include <stdio.h>

int main()
{
    int length;
    int breadth;
    int result;
    printf("Enter the length of a reactangle:");
    scanf("%d", &length);
    printf("Enter the breadth of a rectangle:");
    scanf("%d", &breadth);
    result = length * breadth;
    printf("The area of rectangle is :%d", result);
    return 0;
}