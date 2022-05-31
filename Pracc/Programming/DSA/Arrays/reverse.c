//Normal Way
// #include<stdio.h>
// #include<stdlib.h>
// int main(){
//    int arr[]={1,2,3};
//     int len =sizeof(arr)/sizeof(int);
//     int res[len];
//     for (int i = len-1; i >=0; i--)
//     {
//         /* code */
//         res[i]=arr[len-i-1];
//     }
//     for (int i = 0; i < len; i++)
//     {
//         /* code */
//         printf("%d\t",res[i]);
//     }
 
//    return 0; 
// }

//Interative way
// #include<stdio.h>
// void printarr(int a[],int len){
//         printf("The array elements are:\n");
//     for (int i = 0; i < len; i++)
//     {
//         printf("%d\t",a[i]);
//     }
// }
// void reversearr(int a[],int start ,int end){
//     int temp;
//     while(start<end)
//     {
//         temp=a[start];
//         a[start]=a[end];
//         a[end]=temp;
//         start++;
//         end--;

//     }
// }
// int main(){
//     int a[]={1,2,3,4,5};
//     int len= sizeof(a)/sizeof(int);
//     printarr(a,len);
//     int start=0;
//     int end=len-1;
//     reversearr(a,0 ,len-1);
//     printarr(a,len);
// }


