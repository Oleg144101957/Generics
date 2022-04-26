
fun main(){
    val greeting: (String, String) -> Unit = {a: String, b:String ->
        println("Hello $a $b")
    }


    greeting("Oleg", "Ivanov")


}