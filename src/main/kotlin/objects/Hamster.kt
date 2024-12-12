package objects

class Hamster{
    fun speak() = "Squeak! "
    fun exercise() =
        this.speak() + speak() + "Running on Wheel"
}

fun main() {
    val hamster = Hamster()
    println(hamster.exercise())
}