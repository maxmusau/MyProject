//break in while loop
//we can have a list of countries ,,then break at a certain index(country)
fun main(){
    var countries = listOf("Uganda", "United States of America","Tanzania","Kenya","DR Congo")
    //creak the loop after printing Tanzania
    println(countries)
    var index=0
    do{
        println("The country at index $index is:  " +countries[index])

        if (countries[index] == "Tanzania"){
            break
        }
        index++
    }
        while(index <countries.size)
    var name ="ModcomLearning"
    //break a for loop when the letter is L
    for (i in name){
        print(i)
        if (i == 'L')
            break
    }
}