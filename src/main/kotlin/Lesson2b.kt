//conditional statements
//if statements
import java.util.Scanner
fun main(){
    //check conditions using if statements
//    val marks= 80
//    if (marks > 50) {
//        println("Marks= $marks; above 50 ")
//    }
//    else{
//        println(" Marks= $marks; below 50")
//        }
    val scanner=Scanner(System.`in`)
    print("Enter Marks: ")
    val marks:Int=scanner.nextInt()
    if ( marks >=0 && marks <50){
        println("Marks= $marks . The student has failed ")
    }
    else if (marks >= 50 && marks <65){
        println("Marks= $marks . student below average ")
    }
    else if (marks >=65 && marks <75){
        println("Marks= $marks . The student has passed ")
    }
    else if(marks >= 75 && marks <=100){
        println("Marks= $marks . The student has passed very well ")
    }
    else{
        println("Invalid Marks")
    }
    //create a program to help distinguish people who qualify for blood donation
    //someone is below 18 years - cannot donate (under age)
    //someone below 50 kgs cannot donate (under weight)
    //

    }



