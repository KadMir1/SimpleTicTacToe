fun main() {
    // put your code here
    val a = readLine()!!.toString()
    for (i in a) {
        if (i in '0'..'9') {
            println("$i")
            break
        }
    }
}
