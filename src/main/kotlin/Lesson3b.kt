//While loop
//loop executes lines of code several times until a certain condition is met
//in while loop the block of code is executed until the condition is false
//print number as long as it is less than 10
fun main(){
    var num =1
//while(condition){code to run}
    while (num <= 10){
        println("Looping :: $num")
        num++ //increment the value of num
    }
    //create a while loop to check if number is gretaer than 20 and print number at 5
    var number =1
    while (number <20){
        if (number == 5){
            println("Looping number  at $number")
            number++
        }
        else{
            number++
        }
    }
//loop through items in a list using while loop
    var phones= listOf("Samsung","Tecno","Infinix","Iphone")
    println(phones.size)
    var index =0
    while (index < phones.size){
        print("My phone is: ")
        println( phones[index])
        index++
    }
    //print multiples of 2 using a while loop
    var factor =2
    var i =1
    do {
        println(" $factor * $i ="+ factor *i) //calculation to find the multiple of factor
        i++
    }
    while (i <10) //condition to check




}
