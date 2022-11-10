fun main() {
    // write your code here
    val list = MutableList(readln().toInt()) { readln().toInt() }
    val m = readln().toInt()
    var count = 0

    for( i in 0 until list.size) {
        if (list[i] == m) {
            count += 1
        }
    }
    println(count)
}

