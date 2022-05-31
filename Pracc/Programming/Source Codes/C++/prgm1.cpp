// Program that reads the array elements and finds the sum of array elements using pointers
#include <iostream>
#include <stdlib.h>
using namespace std;
int main()
{
    // a[i]=*(a+i) content of array
    //&a[i]=(a+i) address of an array
    int sum = 0;
    int size;
    cout << "Enter the size of array:\n";
    cin >> size;
    int a[size];
    int *p;
    // Assigning pointer the integer array
    p = a;
    cout << "Enter the array elements:\n";
    for (int i = 0; i < size; i++)
    {
        cin >> *(p + i);
    }
    cout << "Array elements are:";
    for (int i = 0; i < size; i++)
    {
        cout << *(p + i) << "\t";
        sum += *(p + i);
    }
    cout << "\nSum of array elements is:%d"<<sum<<endl;
    

    return 0;
}
