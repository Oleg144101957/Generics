fun main (){
    var x = { y: Int -> y * 5 }

    val result = x.invoke(5)
    val result2 = x.invoke(10)

    println(result)
    println(result2)


}