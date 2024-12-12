package objects

class Cat {
    fun meow() = "mrrow!"
}

fun main(){
    val cat = Cat()
    val m1 = cat.meow()
    println(m1)
}