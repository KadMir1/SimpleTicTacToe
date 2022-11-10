fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    val res1 = (a + b) == 20
    val res2 = (a + c) == 20
    val res3 = (b + c) == 20
    val res4 = res1 || res2 || res3
    println(res4)
}