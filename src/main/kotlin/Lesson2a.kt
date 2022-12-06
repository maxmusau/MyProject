import java.util.Scanner
//entry point
fun main(){
//    insert data using input /user to enter the input
    print("Enter text: ")
    val input= readLine()
    println("The Input was $input")
//
//    usng scanner
    //create an object for the scanner class
    val scanner = Scanner(System.`in`)
    print("Enter your number: ")
    val number=scanner.next()
    println("My numberis : $number")

//    integer values
    val IntNumber = Scanner(System.`in`)
    print("Enter Int Value: ")
    val number1:Int=IntNumber.nextInt()
    println("The input for number1 is $number1")
//Float values
    val FloatNum = Scanner(System.`in`)
    print("Enter Float Value: ")
    val num2:Float=FloatNum.nextFloat()
    println("The input for num2 is $num2")

    //double
    val Doublenum = Scanner(System.`in`)
    print("Enter Double Value: ")
    val num3:Double=Doublenum.nextDouble()
    println("The input for num2 is $num3")




}