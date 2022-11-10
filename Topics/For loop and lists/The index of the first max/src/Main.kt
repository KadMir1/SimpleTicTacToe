import kotlin.math.max

fun main() {
    // write your code here
    val list = MutableList(readln().toInt()) { readln().toInt() }
    val max = list.maxOrNull() ?:0
    val result = list.indexOf(max)
    list.indexOf(result)
    println(result)

}