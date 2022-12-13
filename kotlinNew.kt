const val pie=3.14
fun main(args: Array<String>) {
    println("Vivek Panchal")

    /* comments same as C++ {for multiple line } */
    // exact same { for single line

    //******** DATA  TYPE *********
    // string  "Vivek"
    // int 26
    // char 'C'
    // Boolean True
    // Float 29.87

    // in kotlin we use val,var and const val
    // val -> we can't change the value again -> val jk=10
    // i cant do this val jk= jk+5 or val jk = 16
    // in var i can redefine
    // const val use for making global variable and use it anywhere in the project

    val jk=10
    var viv=15
    viv += 5
    println(viv)
    println(jk)

    // if we want to check data type of any variable
    val xyz=10.54
    println(xyz::class.java) // double

    // string :- "A to Z or a to z character store in double quotes("")
    // Char :- "A to Z or a to z character store in single quotes('')
    val a="vivek" // string
    val b='A' // char

    // String function

    // length-> a.length
    println(a.length)

    // get -> a.get(index) or []
    println(a.get(2))

    println(a[1])

    // substring :- print string between 2 given index
    val name= "I am a student"
    println(name.substring(5,9))  // output :- a st
    println(name.substring(2,14)) // output :- am a student

    // string template :- Use any variable between string

    println("My name is $a") // a string store my name there in can use it here using $

    // For perform arithmetic operations
    val temp=100
    val temp2=54

    println("Sum of temp 1 & 2 is ${temp+temp2} ") //154
    println("Difference of temp 1 & 2 is ${temp-temp2} ") //46
    println("Multiplication of temp 1 & 2 is ${temp*temp2}") //5400
    println("divide of temp 1 & 2 is ${temp / temp2}") //1

    // USER INPUT or READ LINE

    println("Enter value of NUM1 ")
    val num1= readLine()?:"" // ?:"" null check

    val num2= readLine()?:""
    println("Enter value of NUM1 ")

    println(num1.toInt().plus(num2.toInt())) // num1 & 2 is string therefore we need to convert it into Int

    //OPERATOR :- An operator in a programming language is a symbol that tells the compiler or interpreter  to perform specific mathematical or logical operation and produce final result
    // TYPES OF OPERATORS
    // *ARITHMETIC :- Arithmetic operator is use to perform mathematical operations in programming language
//    sum (+)
//    minus(-)
//    modules (%) reminder
//    divide(/)
//    multiplication(*)
//    Increment (++)
//    Decrement (--)


    // *RELATIONAL :- Comparison of 2 variable or Relation bw two variable
//    > greater than
//    < less than
//    >= greater than equal
//    <= less than equal
//    == double equal
//    != not equal


    // *LOGICAL:- Compare two value and return value in Boolean format
//            &&  AND
//            ||  OR
//            !   NOT
    // *ASSIGNMENT :- Use to assign value
//    = equal
//    += plus equal
//    -= minus equal
//    *= multiplication equal
//    /= devide equal
    // *TERNARY (CONDITIONAL)

    //Mutable collection

    val list= mutableListOf<String>("A","B","C","D")

    list.add("E")
    list.add("F")

    println(list) // output [A, B, C, D, E, F]


/************ FLOW CONTROL ******************/

    // if else
    println("Are you hungry??")
    val hungry= readLine()?:""
    val isHungry=hungry.toBoolean()

    if(isHungry==true){
        println("you can Eat Food")
    }
    else
    {
        println("you can't Eat Food")
    }

    // For Loop

    for(shri in list){
        println(shri)
    }

    for(i in 0..5){
        println(i)
    }

    // while loop

    var v=0
    while(v<50){
        println("hello vivek")
        v+=5
    }

    // do while

    do{
        println("hello vivek")
        v+=5
    } while(v<100)

    // when ( same as switch case in C++)
    val vgs= readLine() ?:""
    val number = vgs.toInt()

    when (number){

        0->{
            println("input is 0")
        }

        1->{
            println("input is 1")
        }
        2->{
            println("input is 2")
        }
        3->{
            println("input is 3")
        }
        4->{
            println("input is 4")
        }
        5->{
            println("input is 5")
        }
        6->{
            println("input is 6")
        }
        7->{
            println("input is 7")
        }

        8->{
            println("input is 8")
        }
        9->{
            println("input is 9")
        }
        else->{
            println("input is no a single digit number")
        }

    }

    // FUNCTIONS :-code block for some task
    // -> use to perform specific task in any programming language
    // -> take argument and perform task and return value
    // -> Function can be call inside the function

    example()
    println(sum())




}

// FUNCTIONS :-code block for some task
// -> use to perform specific task in any programming language
// -> take argument and perform task and return value
// -> Function can be call inside the function
    fun example(){
        println("i am inside example function")
    }
fun sum(): Int{
    val a=25
    val b=85
    val total= a+b
    return total
}
