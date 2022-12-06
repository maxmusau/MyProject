import kotlin.math.sqrt

//functions
fun main(){
    //built-in functions, e.g print(ln),sum,arrayOf,
    var sum = arrayOf(50,70,390,63,39).sum()
    println("the sum of nubers ina n array is : "+sum)
    var num1=50
    var num2=50
    var result= num1.rem(num2)
    println("The reminder is $result")
    println(sqrt(256.0))
    //check if number is equal to
    var boolean= num1.compareTo(num2) //prints 0 if the result is true and 1 if the result is false
    println("the noolean is :"+boolean)
    println(num1==num2)
    BMI()
    area(12,20)
    names("Maxwell","Musau")
    student("Melina Sambu",5,'B')

    //sqrt(), -
// toInt(),- convert to Integer
// readLine(), - standard input
// compareTo(), -compare 2 numbers and returns boolean value (0 -true, 1-false)
}

//user_defined functions
fun BMI(){
    print("Enter height in metres")
    var height:Float= readLine()!!.toFloat()
    print("Enter weight in KGs")
    var weight:Int = readLine()!!.toInt()
    var BMI = weight /(height * height)
    println("The BMI value Is $BMI")
}
//create a program that calculates the area of a triangle
//create a function with parameters
fun area(height:Int,base:Int){
    val area =0.5*(height *base)
    println("The area of a triangle is $area")
}
fun names(Fname:String,Lname:String){
    println("My Name is $Fname $Lname")

}
//create a function ,pass parameters std_name,class(1,3,5),grade(A,B,C,D)
fun student(std_name:String,class_name:Int,grade:Char){
    println("The name of the student is $std_name, she is in class $class_name and she scored grade $grade")

}