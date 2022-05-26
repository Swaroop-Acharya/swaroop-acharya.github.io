#include<stdio.h>
#include<stdlib.h>
int main(){
   int arr[]={1,2,3};
    int len =sizeof(arr)/sizeof(int);
    int res[len];
    for (int i = len-1; i >=0; i--)
    {
        /* code */
        res[i]=arr[len-i-1];
    }
    for (int i = 0; i < len; i++)
    {
        /* code */
        printf("%d\t",res[i]);
    }
 
   return 0; 
}