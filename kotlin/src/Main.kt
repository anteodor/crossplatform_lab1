import kotlin.math.sqrt

fun main() {
    println("Lab 01 - Task 1 (Variant 13)")
    print("Enter leg a: ")
    val a = readln().toFloat()

    print("Enter leg b: ")
    val b = readln().toFloat()

    val c = sqrt(a * a + b * b)
    val p = a + b + c

    println("Hypotenuse c = %.3f".format(c))
    println("Perimeter P = %.3f".format(p))
}