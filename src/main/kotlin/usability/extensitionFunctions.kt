package usability

// String Word Count
fun String.wordCount(): Int = this.split("", "\n").filter {it. isNotBlank()}.size

fun main(){
    val text = "Today is Sartuday"
    println(" word Count: ${text.wordCount()}")
}

