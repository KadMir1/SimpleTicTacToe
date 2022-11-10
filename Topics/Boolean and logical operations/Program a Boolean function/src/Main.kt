fun main() {
    val x = readLine().toBoolean() // read other values in the same way
    // write your code here
    val y = readLine().toBoolean()
    val z = readLine().toBoolean()
    val bool = !(x && y) || z
    println(bool)
}