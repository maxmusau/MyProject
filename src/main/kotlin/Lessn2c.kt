import java.util.Scanner
fun main(){
//    program for donating blood
    val input =Scanner(System.`in`)
    print("Enter your Age: ")
    val age=input.nextInt()
    val scanner =Scanner(System.`in`)
    print("Enter your Weight in Kgs: : ")
    val weight=input.nextInt()
    if (age <18 ){
        println("sorry you cannot donate blood :Under age")
    }
    else if (age >=18 ){
        if (weight <50 ){
            println("sorry you cannot donate blood :Under weight")
        }
        else{
            println("Free to donate blood")
        }

    }

}