class Car {
    //kotlin classes
    //objects ,properties ,functions
//    car as an object has properties; brand,model,YO: functions include brakes,engine,speed
    //the properties are just variables holding values
    var brand=""
    var model =""
    var year=0
    //weight,color
    var weight=0
    var color=""


    fun drive(){
        println("Driving Subaru Forester is the best thing that happened to me")
    }
    fun speed(){
        val speed="200 KM/H"
        println(speed)
    }

}
fun main(){
    //create variable to represent the object
    //creating an object for the class car
    var object1 = Car()

    //assign the properties to the class
    object1.brand ="Subaru"
    object1.model="Subaru Forester"
    object1.year=1879
    object1.weight=12345
    object1.color="Blue"

    //print the output
    println(object1.brand)
    println(object1.model)
    println(object1.year)
    println(object1.weight)
    println(object1.color)
    object1.drive()
    object1.speed()


}