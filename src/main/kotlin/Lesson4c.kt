//Kotlin arrays
//used to store dat , numeric or string(text)
//store related data
//the items in an array are mutable
//arrays have fixed size - you cannot add items
//can change the items in the array
//arrays are prefered for their better performances
//list in kotlin is immutable (cannot cahnge the items , nor add
//to change items in a list use mutable list
fun main(){
    //list
    val list= listOf<String>("hello","Kotlin")
    println(list)

    //array
    val myarray = arrayOf<String>("Erick","Joseph","Monica","Mings")

    for (i in myarray)
        println(i)
    val numbers = arrayOf(1,2,3,4,5,6)
    //length  of an array
    println(myarray.size)
    //change item
    myarray[0]="Meshack"
    for (i in myarray)
        println(i)
    //declaring array
//    /implicit declartion - type not defined
    var cities = arrayOf("Nairobi","Mombasa","Nakuru")
    //explicit declaration
    var num = arrayOf<Int>(2,5,4,3,6,5) ///integer
    var boolean = arrayOf<Boolean>(false,true) //Boolean
    var characters= arrayOf<Char>('A','J','f','d') //character

    //print cities starting with some letters
    for (city in cities){
        if (city.startsWith('N')){
            println("$city starts with letter N")
        }
    }
    //create a array of countries with both one and two names
    //print countries with two names
    //South Africa, Kenya, South Sudan, United Kingdom,uganda
    var countries = arrayOf("South Sudan","South Africa","Kenya","Tanzania","Uganda","United Kngdom")
    println("Countries with two name: ")
    for (country in countries)
        if (" " in country){
//            println(country)
            //create an empty array and add some items
            var arrayList= arrayListOf<String>()
            arrayList.add(country)

            println(arrayList)
        }
    //alternative method
//        if (country.contains(" ")){
//            println("$country is a country that has two names")
//        }
    //create an empty array





}