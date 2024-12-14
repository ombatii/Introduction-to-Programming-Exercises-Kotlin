package objects

fun main(){
    val constants = mutableMapOf<String, Double>(
        "Pi" to 3.141,
        "e"  to 2.718,
        "phi" to 1.618
    )
    println("Constants: $constants")

    println("""e: ${constants["e"]}""")

    println(constants.keys)

    println(constants.values)

    var s = ""
    // Iterate through key-value pairs
    for(entry in constants){
        s += "${entry.key}=${entry.value},"
    }
    println("s: $s")

    var x = ""
    // Unpack during iteration:
    for ((key, value) in constants)
        x +=  "$key=$value, "
    println("x: $x")

    //Add value
    constants += "seconds"  to 60.0

    //Change value
    constants["seconds"] = 60.1


    println(constants["seconds"])
    //handle null
    println(constants.getOrDefault("height", "?"))

}