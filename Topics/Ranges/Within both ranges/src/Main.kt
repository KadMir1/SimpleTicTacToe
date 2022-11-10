fun main() {
    // write your code here
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val c: Int = readln().toInt()
    val d: Int = readln().toInt()
    val e: Int = readln().toInt()

    val res1 = e in a..b
    val res2 = e in c..d

    if (res1 && res2) {
        println("true")
    } else  {
        println("false")
    }
}