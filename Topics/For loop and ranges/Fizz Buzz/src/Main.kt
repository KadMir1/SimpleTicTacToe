fun main() {
    // put your code here
    val a = readln().toInt()
    val b = readln().toInt()

    for(res in a .. b) {
        if(res % 3 == 0 && res % 5 == 0) {
            println("FizzBuzz")
        } else if ( res % 3 == 0) {
            println("Fizz")
        } else if (res % 5 == 0) {
            println("Buzz")
        } else {
            println(res)
        }
    }
}