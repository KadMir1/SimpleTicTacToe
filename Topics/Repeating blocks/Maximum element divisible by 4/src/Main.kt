fun main() {
    // put your code here
    val a = readln().toInt()
    var max = 0

    repeat(a) {
        val b = readln().toInt()
        if (b % 4 == 0 && b > max) {
            max = b
        }
    }
    println(max)
}