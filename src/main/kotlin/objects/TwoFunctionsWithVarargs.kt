package objects

fun first(vararg numbers: Int): String{
    var result = ""
    for( i in numbers){
        result +="[$i]"
    }
    return result
}

fun second(vararg numbers: Int) =
    first(*numbers)


fun main(){
    val x = second(7, 9, 32)
    println(x)
}