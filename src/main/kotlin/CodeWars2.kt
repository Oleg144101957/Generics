import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat
import kotlin.math.roundToInt

//12, 50, 1000 -> 166

fun main(){

    convert(20.0){it * 1.8 + 32}
    convertFive { it * 1.8 + 32 }


    val d1: BigDecimal = BigDecimal(2.75)
    val d2: BigDecimal = BigDecimal(2.45)

    println(d1-d2)


    println(
        dutyFree2(12, 50, 1000)
    )

    println(
        dutyFree2(377, 40, 9048)
    )



}


fun convert (x: Double, converter: (Double)->Double): Double {
    val result = converter(x)
    println("$x is converted $result")

    return result
}

fun convertFive (converter: (Int) -> Double): Double {
    val result = converter(5)
    println("5 is converted to $result")

    return result

}


fun potatoes(p0:Int, w0:Int, p1:Int):Int {
    // your code
    val coefficient: Double = (100-p0.toDouble())/(100-p1.toDouble())
    val result: Double = w0*coefficient

    return result.toInt()
}




fun dutyFree(normPrice: Int, discount:Int, hol:Int) : Int {
    //code here
    val roundingWindow = 0.000000001

    val priseWithDiscount: (Int, Int) -> Double = { a: Int, b: Int -> a*b/100.00}
    val result = hol/priseWithDiscount.invoke(normPrice, discount)

    return (result + roundingWindow).toInt()
}

fun dutyFree2 (normPrice: Int, discount:Int, hol:Int) = hol*100/(normPrice * discount)

//59.99999999999999 -> 60
//166.66666666666666 -> 166