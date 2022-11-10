import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val (a, b, c, d) = Array(4) { scanner.nextLong() }

    (0..1000)
        .filter { 0L == d + (c + (b + a * it) * it) * it }
        .forEach { println(it) }
}