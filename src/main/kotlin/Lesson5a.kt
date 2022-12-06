//kotlin functions
fun student_details(std_name:String,class_name:Int,grade:Char){
    println("The name of the student is $std_name ")
    println("$std_name is in class $class_name")
    println("$std_name who is in class $class_name got grade $grade")

}
fun mul(a:Int,b:Int): Int {
    val result =a.times(b)
    println(result)
    return result

}
//create a function for comparing two numbers
fun compare(num1:Int,num2:Int):String{
    var comparison = num1.compareTo(num2)
    if (comparison == 0){
        var status ="True"
        println("The status is $status")
        return status

    }
    else{
        var status ="False"
        println("The status is $status")
        return status
    }

}

fun main(){
    var std_name ="Collins Mwenda"
    var class_name = 7
    var grade ='A'
    student_details(std_name,class_name,grade)
    student_details("Sheila Mokay",8,'C')
    mul(4,5)
    compare(3,9)
    compare_strings("Hello","hi")
}
//compare two strings
fun compare_strings(string1:String,string2:String):String{
    var comparison = string1.compareTo(string2)
    if (comparison == 0){
        var status ="True"
        println("The status is $status")
        return status

    }
    else{
        var status ="False"
        println("The status is $status")
        return status
    }

}
//android studio