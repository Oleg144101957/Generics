abstract class Pet(var name: String) {
}

class Cat (name: String) : Pet (name){}

class Dog (name: String) : Pet (name){}

class Fish (name: String) : Pet (name){}

class Contest <T: Pet>{
    val scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0){
        if (score>=0) scores.put(t, score)
    }

    fun getWinners() : MutableSet<T>{
        val winnners: MutableSet<T> = mutableSetOf()
        val highScore = scores.values.maxOf { it }

        for ((t, score) in scores){
            if (score == highScore) winnners.add(t)
        }

        return winnners
    }

}

fun main (args: Array<String>){
    val catFuzz = Cat("Fuzz LightYear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    val catContest = Contest<Cat>()
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)
    val topCat = catContest.getWinners().first()
    println("Pet contest winner is ${topCat.name}")
}