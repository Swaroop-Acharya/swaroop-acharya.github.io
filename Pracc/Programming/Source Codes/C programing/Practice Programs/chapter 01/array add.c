#include<stdio.h>
int main(){
   int arr[5], *p,sum=0,key;
   p=&arr[0];
   printf("Enter the array elements:\n");
   for (int i = 0; i <5; i++)
   {
       scanf("%d\n",p+i);
   }
   printf("Array elements are:\n");
   for (int i = 0; i < 5; i++)
   {
       printf("%d\n",*(p+i));
   }
   printf("The sum array element is:\n");
   for (int i = 0; i <5; i++)
   {
       sum+=*(i+p);
   }
   printf("%d\n",sum);
   return 0;
}