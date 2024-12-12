package objects

fun main(){
    val first = mutableListOf<Int>(1)
    val second: List<Int> = first
    first.add(2)
    println(second)
}