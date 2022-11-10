import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main() {
    // write your code here
    val s = readln()
    val parser = SimpleDateFormat("yyyy-MM-dd")
    val format = SimpleDateFormat("MM/dd/yyyy")
    val formattedDate = format.format(parser.parse(s))
    println(formattedDate)
}