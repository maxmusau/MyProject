import java.util.Scanner
//conditional ststements

fun main(){
    //when
    val scanner =Scanner(System.`in`)
    print("Enter marks: ")
    val marks =scanner.nextInt()
    when (marks){
        in 0..49 ->{
            println("Student failed")
        }
        in 50..74 ->{
            println("Student below average")
        }
        in 75..100 ->{
            println("Student Above average")
        }
    }//end of when expression
    //input name of an object  using readLine
    //use when to print what the object represents
    //sun, -> star
    //moon -> satelite
    //Earth -> planet
    print("Enter the name of the Object: ")
    val myobject = readLine()
    when (myobject){
        "sun"-> println(" $myobject is a star")
        "moon"-> println("$myobject is a satelite")
        "earth"-> println("$myobject is a planet")
    }//end of when
//    check if the input is in indicated
    print("Enter name : ")
    val name = readLine()

    when(name){
        "mango","passion","orange","pineaple","banana","avocado" -> {
            println("$name this is a fruit")
        }
        "BMW","Nissan Patrol","Honda","Lexus","Landrover","Mazda" ->{
            println("$name is a car")
        }
        else->{
            println("Invalid input")

        }
    }




}