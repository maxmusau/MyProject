fun main(){
    //create a simple program to calculate simple interest SI =p*r*t/100
    var p =200000
    var r =5
    var t=3
    var SI = p*r*t/100
    var paid:Boolean =true
    println("The Simple interest $ is $SI payment status is $paid")

//    BMI weight /(height*height)
    var weight:Int
    var height:Double
    var BMI:Double
    weight =60
    height=1.0
    BMI = weight / (height*height)
    println("The weight of person X is $weight and height is $height so BMI is $BMI")

    //create a program that converts temp from degrees celcius to fahrenheit
    //from degree celcius to F (degrees *1.8 )+32
    var degrees:Int =30
    var Farenheit=(degrees *1.8) +32
    println("$degrees degrees is equal to $Farenheit Farenheit")

}