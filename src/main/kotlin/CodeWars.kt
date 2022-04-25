

fun main(){

    val s = "njMK\ndbrZ\nLPKo\ncEYz"

    println(
    Opstrings.oper(Opstrings::vertMirror, s)
    )

}

object Opstrings {
    fun vertMirror (str: String) = str.split("\n").map { it.reversed() }.joinToString("\n")
    fun horMirror (str: String) = str.split("\n").reversed().joinToString("\n")
    fun oper (op: (String) -> String, s: String) = op(s)
}