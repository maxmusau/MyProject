//for loop
fun main() {
    val name = "Modcom"
    println("The name is $name")
    for (letter in name){
        println(letter)
    }
    for (i in 1..6){
        println("The numbers in range 1 - 6 are $i")
    }
    //create a list of courses and use for loop to iterate the items
    //use listOf to create a list in kotlin
    val courses= listOf("HTML","Java","Java Script","Kotlin","Python","PHP")

    println(courses)
    for (course in courses){
        println(course)
    }
    for (i in 6 downTo 1){
        println(i)
    }
    for (i in 6 downTo 0 step 2){
        println(i)
    }
    val nation= "kenya"
    for (letter in nation) println(letter)
    println(courses[0])

    for ((index,value) in courses.withIndex()){
        println("The course is $value and it's at index $index")
    }









}