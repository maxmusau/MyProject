//continue in while loop
//check that a condition is true and continue without executing the expression
//proceed to the next step of the nearest enclosing loop
fun main(){
    var num=0
    while (num <10){
        //check if num divisible by 3
        if (num % 3 ==0){
            println(num)
            num++
            continue
        }

        num++
    }
    println("Checking numbers between 5 and 12")
    //continue using do while loop
    var num2 = 1
    do{
        if (num2 <5 || num2 >12){ //numbers less than 5 or  numbers greataer than 12
            num2++
            continue
        }
        println(num2)
        num2++
    }
    while(num2 <15)

}