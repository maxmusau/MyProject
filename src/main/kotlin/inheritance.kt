//inheritance in kotlin
//kotlin inheritance has two classes; super class, subclass
//the inheritance is from the superclass
//use open class to create the super class
//superclass-parent
open class MyParentClass{
    val x =6
    val name="Modcom"
    var courses= arrayListOf<String>("HTML","CSS","Data Science","Python","Mobile Developmeent")
    var course=courses.toString()
}
//subclass -child
class MyChildClass:MyParentClass() {
    fun myfunction(){
        println(x)
        println(name)

        println("The name of my School is " + name + " and the courses offered are: "+ course)
    }
}
fun main(){
    val obj1=MyChildClass()
    obj1.myfunction()
}
//why inheritance
//reusability of properties and functions