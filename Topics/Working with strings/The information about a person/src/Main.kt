import java.util.Scanner

fun main() {
    // put your code here
    val scanner = Scanner(System.`in`)
    val info = scanner.nextLine().split(" ")
    val first = info[0]
    val second = info[1]
    val third = info[2]

    println(first[0] + "." + " " + second + ", " + "$third years old" )

}