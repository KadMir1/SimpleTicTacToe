fun main() {
    // put your code here
    val a = readln().toInt()

    val b = readln().toInt()
    var res = 0

    if (a<b) {
        for (c in a..b)
            res += c
        println(res)
    }
}