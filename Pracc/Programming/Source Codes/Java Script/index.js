// console.clear()
// console.warn("he")
//console.write("Message on screen")
//console.log("Message at the console")
//console.error("Error Message at the console")

// variables
// 1)var
// 2)let 
// 3)const

//Data types
//var num=10,num2='Hi '
// console.log(num+num2)



//Objects
// var marks1={
//     math:80,
//     science:90,
//     eng:100
    
// } 
// console.log(marks1)

// //Booleans
// var a=true
// var b=false
// console.log(a,b)

// var und=undefined      //same as var und
// var nu=null
// console.log(und)

//There are two types of data types in javaScript
//1.Primitive:-undefined ,null,number ,string ,boolean , symbol 
//2.Reference:-Object and arrays

//Arrays
// var arr=[1,2,,23,"hwllo",3,3]
// console.log(arr[4])



//Operators
//Arithmatic operator
// var a=10;
// var b=20;
// console.log(a+b)

//Assignment
// var c=b
// console.log(c)
// c=10
// console.log(c)

//Comparison operator
// var a=10
// var b=20
// console.log(a==b)
// console.log(a>=b)

//Logical operators
// console.log(true && true)
// console.log(true && false)
// console.log(true || false)
//Logical NOT 
// console.log(!false) 


//Fuctions {Is implemented to DRY-Donot repeat yourself }
// function avg(a,b){
    //     return (a+b)/2;
    // }
    // c=avg(10,10);
    // console.log(c)
    // console.log(avg(60,60))
    
    // ES6
    // avg=(a,b)=>(a+b);
    // var result =avg(10,10);
    // console.log(result)
    /*
    
    function NameFnc(){
        console.log("Iam fuction")
    }
    
    var NameVar=() =>{
        console.log("Hi")
    }
    
    NameFnc();
    NameVar();
    
    */
    /*
    //Es6 fuction snippet
    var CalVar=(Numvar)=>{
        return Numvar*Numvar;
    }
     var res=CalVar(8);
     console.log(res)
    
    */
    
    
    /*
    if u have one parameter to the fuction u can write as below &
    while performing mathmatical fuction we no need to use {} inside body
    of the fuction
    
     var CalVar=(Numvar)=> Numvar*Numvar;
     var res=CalVar(8);
     console.log(res)
    
     */
    
    
     /*
    
//Conditional statement
//IF
//if..else
//if...else..if...else
//for loop
//while loop
//do while loop

//while loop
// var i=0
// while(i<5)
// {
//     console.log("Hi dude")
//     i=i+1;
// }

//for each loop
// arr=[1,2,23,34,4]
// arr.forEach(function(element)
// {
//     console.log(element)
// })


// do while loop
// var arr=[5,,6,"iam "]
// var i=0;
// do{
//     console.log(arr[i])  
//     i++;
// }while(i<5)

//Break and Continue statements
// var arr=[1,2,3,4,5,6]
// for(var i=0;i<arr.length;i++)
// {
//     if(i==3)
//         // continue;
//         break
//     console.log(arr[i])
// }


//Array methods
// var array=[1,"Hi",null,undefined,,]
// array.pop()
// console.log(array)
// array.push("Iam swaroop")
// console.log(array)

// array.shift()     //To delete first element
// console.log(array)
// array.unshift("First")

// NewArrayLen=array.unshift("FF") //length of the new created array
// console.log(NewArrayLen)   //To insert an element at the 0th index

// var arr=[1,6,7,9,331,332]
// console.log(arr.sort()) //it will convert the array into strings and then it wil sort the items according to UTF1-6 code units value
// console.log(arr.toString())


// String methods
// let myString="Iam very good at this , Iam mean really good"
// console.log(myString.length)
// console.log(myString[0])
// console.log(myString.indexOf("good"))  //Index of First instance of the matching word
// console.log(myString.lastIndexOf("good"))  //Index of Last instance of the matching word
// console.log(myString.slice(0,6))
// result=myString.replace("Iam","Swaroop")
// console.log(result)

//Date in JS
// let myDate=new Date()
// console.log(myDate.getDay())
// console.log(myDate.getMinutes())
// console.log(myDate.getFullYear())
// console.log(myDate.getMonth())


//Interview question let,const,var
//const,let block level
 let NameVar="hello"

 for(let i=0;i<5;i++){
     const HiVar="hi"
     console.log("Step1",HiVar)
     HiVar="Hello"
     console.log(i)
    }
    console.log(HiVar)
*/

/* ES6
... => Spread operator 


var arr1=[1,2,3];
var arr2=[4,5,6];

var ResArr=[...arr1,...arr2];
console.log(ResArr)


*/

/*
//Array Destructuring
var [f1,f2]=["Jon","Abrahim"]
console.log(f2)
console.log(f1)


var [f1,,f2]=["Jon","Abrahim","Shrikanth"]
console.log(f2)
*/


/*
//Destructuring array having key value pair

var {Thandoor,SamDine,Plaza}={
"Thandoor":"nan",
"SamDine":"Biriyani",
"Plaza":"Wine"

}
console.log(Plaza)
*/


// set of statments which can be reused is called as fuction 
// set of function having similar property = class 
// set of class = package / module 
// set of package = project 

/*
class  NameClass{
   
    Name="Swaroop"
    Fnc(){
        console.log("Iam a fuction inside the class")
    }
}

var ClassVar=new NameClass()
ClassVar.Fnc()
console.log(ClassVar.Name)

*/

/*
class  NameClass{
    //whenever we have an variable inside the class we have to use
    //this variable inorder to use that variable in the fuction that
    //belong to the same class
    Name=""
    Fnc(Name){
        this.Name=Name
        console.log("Iam a fuction inside the class"+" " + Name)
    }
}

var ClassVar=new NameClass()
ClassVar.Fnc("Ramesh")
ClassVar.Fnc("Ganesh")

*/

// class Operation{
//     add(a,b){
//         return a+b;
//     }
//     mul(a,b){
//         return a*b;
//     }
//     sub(a,b){
//         return a-b;
//     }

// }
// var opClass=new Operation()
// res1=opClass.add(10,20)
// res2=opClass.mul(10,20)
// res3=opClass.sub(10,20)
// console.log(res1)
// console.log(res2)
// console.log(res3)

//DOM(Document Object Model) operation -Very important

// document
// document.location

//DOM manipulation
// document.getElementById('click')
// document.getElementById("click").click()
// document.getElementById("click").style.border="2px solid red"

// let ele=document.getElementsByClassName('heading')
// console.log(ele[0]);
// ele[0].style.background='aqua'
// ele[1].style.background='lightblue'

//->To add a class to the perticular tag
// ele[0].classList.add('background')

//->To remove a class to the perticular tag
// ele[0].classList.remove('background')

// console.log(ele[1].textContent)

// console.log(ele[1].innerHTML)


// res=document.getElementsByTagName('h1')
// console.log(res)
// //Adding child to the  tag
// createChild=document.createElement('p')
// createChild.innerText="Hi iam happy"
// res[0].appendChild(createChild)
// res[0].removeChild(p)


// document.links
// document.url
// document.forms
// document.scripts
// document.title
// document.images

// // Selecting using query 
// var sel=document.querySelector('.heading') //First element will be selected

// var sel=document.querySelectorAll('.heading') //All the elements
// console.log(sel)


//Events in JS

function clicked(){
    alert('Clicked!!');
       console
}
