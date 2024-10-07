fun Greetings(name : String):String{
    val greeting: String = "Welcome $name"
    return "$greeting"
}

fun main(){
    println(Greetings("Solicode"))
}