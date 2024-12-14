package usability

//Custom Greeting Function
fun greet(name: String = "Guest",
          message: String = "Welcome!"){
      println("Hello, $name! $message")
}

fun main(){
    greet()
    greet("Brian")
    greet(message = "Karibu!", name = "Ombati")
}