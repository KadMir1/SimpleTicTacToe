fun main() {
    // write your code here
    val a: Int = readln().toInt()
    val res = a in 1..10
    if (res) {
        println("false")
    } else {
        println("true")
    }
}