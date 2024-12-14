package objects

class Rectangle(val x: Int, val y: Int){
    val area: Int
    get() = x * y

}

fun main(){
    val rectangle = Rectangle(7,9)
    println("Area of Rectangle: ${rectangle.area}")
}

