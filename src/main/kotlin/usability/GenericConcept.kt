package usability

fun main() {
    val mixedList = listOf(42, "Hello", 3.14, true)

    mixedList.forEach { item ->
        processItem(item)
    }
}

fun <T : Any> processItem(item: T) {
    println("Processing item of type: ${item::class.simpleName}")

    when (item) {
        is String -> println("It's a String: $item")
        is Int -> println("It's an Int: ${item * 2}")
        is Double -> println("It's a Double: ${item * item}")
        is Boolean -> println("It's a Boolean: ${if (item) "True" else "False"}")
        else -> println("Unknown type")
    }
}
