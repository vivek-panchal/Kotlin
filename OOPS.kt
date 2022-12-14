fun main(args:Array<String>){

    //object
    val objectName=Song()
    objectName.songName="Mai Rahu Ya Na Rahu"
    objectName.songArtist="Pritam"
    objectName.songDuration=6.5
    objectName.availableOnSpotify=true

    println(objectName.songName)
    println(objectName.songDuration)
    println(objectName.songArtist)
    println(objectName.availableOnSpotify)

    val song2=Song()
    song2.songName="Hamsafar"
    song2.songArtist="Arijit"
    song2.songDuration=5.24
    song2.availableOnSpotify=true

    println(song2.songName)
    println(song2.songDuration)
    println(song2.songArtist)
    println(song2.availableOnSpotify)

    // call methods
    song2.pause()
    song2.play()
    song2.stop()

    // Main OOPS Concepts

    // * INHERITANCE
    // -> Inherit parent class
    // -> Can use all property of parent class
    // -> Code Reduce

    // now we can use property of parent class into Vivek, Akshit, Anuj

    val objVivek=Vivek()
    objVivek.name
    objVivek.surname
    //Etc same as

    // polymorphism :- Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks.

    val a : Plus = Plus(10)
    println(a.calculate())

    val b: Multiplication = Multiplication(25)
    println(b.calculate())

    // Abstraction
    val c= plus2(25)
    println(c.calculation2())

}

// class Syntax

class Song(){
    //member of class
    var songName:String?=null
    var songDuration: Double?= null
    var songArtist: String?= null
    var availableOnSpotify: Boolean?= null

    //method of class
    fun play(){
        println("Song is playing")
    }

    fun pause(){
        println("Song is pause now")
    }

    fun stop(){
        println("Son is stop")
    }
}

// INHERITANCE

// we can use this class in other classes
open class ParentClass(){
    val name:String ? = null
    val surname:String ? = null
    val height: String ? = null
    val fatherName: String ? = null
}
class Vivek() : ParentClass(){

    val canWorkOnAndroid: Boolean ?= null
    val havePc: Boolean ?= null
}

class Akshit() : ParentClass(){

    val canDing : Boolean ?= null
    val haveMic : Boolean? = null

}
class Anuj() : ParentClass(){
    val canDance: Boolean?=null

}

// polymorphism :- Inheritance lets us inherit attributes and methods from another class. Polymorphism uses those methods to perform different tasks.
open class Parent(){

    open fun calculate(): Int{
        return 0;
    }
}

class Plus (val value: Int) : Parent(){
    override fun calculate(): Int {
        return value + value
    }
}

class Multiplication ( val value1: Int) : Parent(){
    override fun calculate(): Int {
        return value1 * value1
    }
}

// Abstraction
// * Class declared with abstracted keyword
// * Can't create object of abstraction class

abstract class Parent2(){
    abstract  fun calculation2() :Int
}

class plus2(val value2:Int) : Parent2(){
    override fun calculation2(): Int {
        return value2 + value2
    }

}

// ENCAPSULATION :- The wrapping up of data under a single unit.
// scope :- scope means variable and function are available in only declared code
// modifiers :-
    // Private:- Visible inside only for specific class
    // Protected :- Visible inside class and inheriting class super.variableName
    // Internal :- Inside the package
    // Public :- Visible anyone to accessing the class

// More About Class
// -> Constructor :- When we create a object of class you can simply pass some value in it using constructor
// -> InIt :- code inside InIt block run first
// -> This
// -> Companion Objects
// -> Getter setter

// INTERFACE
// -> similar as class , As same As abstract class , we can use as variable type
