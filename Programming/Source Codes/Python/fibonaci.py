def func(string):
    count=0
    count1=0
    for i in range(len(string)):
        if(string[i].isupper()==True):
            count=count+1
        if(string[i].islower()==True):
            count1=count1+1
    print("Number of UpperCase letters:",count)
    print("Number of LowerCase letters:",count1)
string=str(input("Enter a String:"))
func(string)
        