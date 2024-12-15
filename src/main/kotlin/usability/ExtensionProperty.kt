package usability

val <T : Any> T.typeName: String
    get() = this::class.simpleName ?: "Unknown"

fun main() {
    val intValue = 42
    val stringValue = "Kotlin"
    val doubleValue = 3.14
    val listValue = listOf(1, 2, 3)

    println("Type of intValue: ${intValue.typeName}")
    println("Type of stringValue: ${stringValue.typeName}")
    println("Type of doubleValue: ${doubleValue.typeName}")
    println("Type of listValue: ${listValue.typeName}")
}
