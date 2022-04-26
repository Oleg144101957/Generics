fun main(){

    var addFive = {x: Int -> x + 5}
    println("Pass 6 is: ${addFive(6)}")

    val addInts = {x: Int, y: Int -> x + y}
    println("Sum of 12 and 32 is ${addInts.invoke(12, 32)}")

    val intLambda: (Int, Int) -> Int = {x: Int, y: Int -> x*y}
    println("Multiply 12 * 4 is ${intLambda.invoke(12, 4)}")

    val addSeven: (Int) -> Int = {it+7}
    println("Add Seven to 10 is: ${addSeven.invoke(10)}")

    val unitLambda: ()-> Unit = { println("Hello") }
    unitLambda()


    var y = 2.3
    var x = 20
    var lam4 = { y: Int -> (y/2).toDouble() }
    print(lam4(x))
    lam4 = { it + 6.3 }
    print(lam4(7))

}