import java.lang.ArithmeticException
import java.util.*

open class MyClass{
    fun myFun(){
        println("I am in class")
    }
}

//Inheritance
class ChildClass :MyClass(){
    fun childFun(){
        println("i am in child class")
    }

}
// functions in Kotlin
fun addNumber(a:Int,b:Int):Int{
   println("this is addNumber function")
    return a+b
}

// higherOrder function
fun sum(a:Int,b:Int):Int{
    return a+b
}
fun higherOrder(a:Int,b:Int,myfun:(Int,Int)->Int){
    println(myfun(a,b))
}
fun main(){
    println("Vivek")
    println("Panchal")
    val foodLike ="Paneer Tikka"
    val nonVeg ="Chiken Tikka"
    val veg ="Paneer Tikka"

    println(foodLike)
    println(nonVeg)
    println(veg)

    // Arithmatic operator
    // +,-,*,/,%
    val a =10
    val b=25


    println("addition ${a+b}")
    println("substraction ${a-b}")
    println("multiplication ${a*b}")
    println("division ${a/b}")
    println("modulus ${b%a}")
//output
//    addition 35
//    substraction -15
//    multiplication 250
//    division 0
//    modulus 5


    //Comparision operator { always return boolean value}
    // <,>,==,<=,>=
    println("a>b ${a>b}")
    println("a<b ${a<b}")
    println("a==b ${a==b}")
    println("a<=b ${a<=b}")
    println("b>=a ${b>=a}")

    //output
//    a>b false
//    a<b true
//    a==b false
//    a<=b true
//    b>=a true

    //Logical Operator { for Conditions}
//    AND => &&
//    OR => ||
//    NOT => !

    // STRING

    var myName= "Vivek Panchal"

    println(myName)
    println(myName.length)
    println(myName.get(8))
    var addString="my name is "
    println(addString.plus( myName))

    // OutPut
//    Vivek Panchal
//            13
//    n
//    my name is Vivek Panchal

    //Array

    //-> syntax
    var arr= arrayOf(1,2,3,4,5,6,"hs","jh","*",58,45)

    println(Arrays.toString(arr))
    println(arr.size)
    arr.set(3,26) // 3rd index per jo bhi value hai usko 26 se replace kar do
    // new array -> [1, 2, 3, 26, 5, 6, hs, jh, *, 58, 45]
    println(Arrays.toString(arr))

    var arr1= intArrayOf(1,2,3,4,5,6,58,45)

    var arr3= intArrayOf(1,20,31,14,5,61,58,45,1,54,14,45)
    // sort array
    println(Arrays.toString(arr3.sortedArray()))

    // print sum
    println(arr1.sum())
    println(arr1.count()) // count number of elements

    // If - Else statement
    var age =15
    if(age>=18 &&  age<150){
        println("you can vote!! ")
    }
    else{
        println("you are not eligible for vote ")
    }

    // when { similar as Switch in C++ }
    var toDay=5
    when(toDay){
        1-> println("sunday")
        2-> println("monday")
        3-> println("tuesday")
        4-> println("wednesday")
        5-> println("thrusday")
        6-> println("friday")
        7-> println("saturday")
    }

    //NULL safety {For storing null in any data type or variable use ? after data type }

    var name : String? =null
    println(name)

    //Loops In Kotlin
// -> for loop
    for(number in 0..500 step 5 ){
        println(number)
    }

    // -> while loop
    var i=0
    while(i<=10){
        println(i)
        i++
    }

    // function call
    println(addNumber(5,25))

    //OOPS in Kotlin

    //1. Inheritance :- The process of creating the new class by extending the the existing class is called inheritance or the process of inheriting the features of base class is called as inheritance.
    //The existing class is called the base class and new class which is created from it is called the derived class.
    //2. Polymorphism :- Poly means many and Morph means forms. Polymorphism is the process in which an object or function take different forms.
    //3. Encapsulation :- Encapsulation is a process of binding data members (variables, properties) and member functions (methods) together. In object oriented programming language we achieve encapsulation through Class.
    //4. Abstraction or Datahiding :- Abstraction is the process of showing only essential/necessary features of an entity/object to the outside world and hide the other irrelevant information.

    var classObj = MyClass()
    classObj.myFun()

    //inheritance :- access parent class propetry
    var childClassObj =ChildClass()
    childClassObj.childFun()
    childClassObj.myFun()


    // Polymorphism

    var n=10
    var m=15

    var myFirstName="Vivek "
    var myLastName="Panchal"

    println(n+m)
    println(myFirstName+myLastName)

    // Try & Catch Block

    try{
        var num=10/0
    } catch(e : ArithmeticException){
        // ager error aaya to catch block execute hoga
        println(e)
    } finally{
        // error aaye ya nhi ye block execute hoga
        println("This is finally block")
    }

    // lamda expression in kotlin (use to reduce code)
    var lamda = { a:Int , b:Int ->a+b}
    println(lamda(15,25))

    // Higher order Function :- take function in parameter and return function

    higherOrder(5,5,::sum)





}
