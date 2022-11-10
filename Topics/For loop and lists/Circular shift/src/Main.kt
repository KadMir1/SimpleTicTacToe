import java.util.*

fun main() {
    // write your code here
    val list = MutableList(readln().toInt()) { readln().toInt() }
    Collections.rotate(list, 1)
    println(list.toIntArray().joinToString(" "))

}