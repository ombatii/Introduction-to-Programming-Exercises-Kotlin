package usability

//Calculator
class calculator{
    fun add(a: Int, b: Int): Int = a + b
    fun add(a: Double, b: Double): Double = a + b

    fun add(a: String, b: String): String = a + b
}

fun main(){
    val calc = calculator()
    println(calc.add(2,4))
    println(calc.add(6.2, 9.1))
    println(calc.add("Brian", " Ombati"))
}