data class Grocery (val name: String, val category: String, val unit: String, val unitPrice: Double, val quantity: Int)


fun main(){

    val groceries = listOf(
Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )



    groceries.groupBy { it.category }.forEach {
        println("Key is ${it.key}")
        it.value.forEach { println("   ${it.name}")}
    }


    val input = listOf(1,2,3,4,5)
    val sumOfInput = input.fold(""){str, item -> str + item }
    println(sumOfInput)






}