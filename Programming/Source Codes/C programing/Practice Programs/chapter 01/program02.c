/*
Program to calculate the area of a circle and area of the cylinder by taking
 same radius value  from the user 
 */
#include <stdio.h>
#define PI 3.14

int main()
{
    int radius;
    printf("Enter the radius of the circle:");
    scanf("%d", &radius);
    printf("The area of a Circle is: %f", PI * radius * 2);
    return 0;
}