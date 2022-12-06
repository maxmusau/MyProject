class Car2(var brand:String,var model:String,var color:String,var YOM:Int) {
    //kotlin constructors
    //create a max_speed function with parameters
    fun max_speed(speed:String){
        println(speed)
    }

}
fun main(){
    var object2=Car2("Subaru","Impreza","Grey",1890)
    println(object2.brand)
    println(object2.model)
    println(object2.color)
    println(object2.YOM)
    println("The brand of our car is: " + object2.brand + " "+ " model = "+ object2.model
    +", color= "+object2.color + "The year of manufacture = "+ object2.YOM)
    object2.max_speed("200 KM/h")


    //employee object
    var obj=employee()
    obj.insertname("Maxwell")
    println(obj.name)
    obj.insertAge(40)
    println(obj.age)

    println(obj.gender)
}
class employee(){
    //properties
    var name:String=""
    var age:Int=0
    var gender:Char='M'
    fun insertname(n:String){
        this.name =n
    }
    fun insertAge(a:Int){
        this.age=a
    }
    fun insertGender(g:Char){
        this.gender=g
    }
}