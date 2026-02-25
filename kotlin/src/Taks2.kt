fun main() {
    println("Lab 01 - Task 2 (Variant 13)")
    print("Enter a three-digit integer: ")

    val n = readln().toInt()

    val sign = if (n < 0) -1 else 1
    val x = kotlin.math.abs(n)

    val last = x % 10
    val rest = x / 10

    val result = (last * 100 + rest) * sign

    println("Result: $result")
}