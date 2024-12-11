package kotlinPractice.programming_basics

/*
let’s calculate body mass index (BMI), which is weight in kilograms divided
by the square of the height in meters. If you have a BMI of less than 18.5, you are
underweight. Between 18.5 and 24.9 is normal weight. BMI of 25 and higher is
overweight.
 */

fun calBodyMassIndex(x: Int, y: Int): String {
    val bmi = x.toDouble() / (y.toDouble() * y.toDouble())
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal Weight"
    else "Overweight"
}

fun main() {
    println("Enter your weight (in kg):")
    val x = readLine()?.toIntOrNull()
    println("Enter your height (in meters):")
    val y = readLine()?.toIntOrNull()


    if (x != null && y != null) {
        println(calBodyMassIndex(x, y))
    } else {
        println("Invalid input. Please enter valid numbers for weight and height.")
    }
}
