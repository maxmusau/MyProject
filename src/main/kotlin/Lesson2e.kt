//when expression
fun main(){
    //print the season based on the month
    print("Enter the  Month: ")
    val month = readLine()!!.toInt()
    when (month){
        in 3..5 -> println("the month is $month and season is Spring")
        in 6..8 -> println("the month is $month and season is Summer")
        in 9..11 -> println("the month is $month and season is Autum")
       12,1,2-> println("the month is $month and season is Winter")

    }
}