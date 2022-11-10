import java.util.Scanner

fun main() {
    // put your code here
    val a = readln().toInt()
    var pos = 0

    repeat(a) {
        val b = readln().toInt()
        if(b > 0) {
            pos += 1
        }
    }
    print(pos)
}