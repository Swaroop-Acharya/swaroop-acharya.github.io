#3.)Write a Python Program for Strong Password Detection using Regular Expression.
import re

while True:
    print("enter the password")
    password = input()
    length = len(password)
    if len(password) < 8:
        print("Must be atleast 8 characters long")
        
    lowerReg = re.compile(r'[a-z]')
    if not(lowerReg.search(password)):
        print("must include lowercase")
        
    upperReg = re.compile(r'[A-Z]')
    if not(upperReg.search(password)):
        print("must include uppercase")
        
    digitReg = re.compile(r'\d')
    if not(digitReg.search(password)):
        print("must include digit")
        
    symbolReg = re.compile(r'[ @!#$%&?`{}]')
    if not(symbolReg.search(password)):
        print("must include symbols")

    else:
        print("strong password")
        break
    print("try again")