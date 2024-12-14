package usability

//Traffic Light Simulation

fun trafficLightAction(lightColor: String): String{
    return when (lightColor.lowercase()){
        "red" -> "Stop"
        "yellow" -> "Get Ready"
        "green" -> "Go"
        else -> "Invalid color"


    }
}

fun main(){
    println(trafficLightAction("Orange")) //Red, yellow, Green
}