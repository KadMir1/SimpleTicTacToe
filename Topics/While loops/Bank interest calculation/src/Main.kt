fun findYears(depo: Double): Int{
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    var years = 0
    //
    // implement the while loop here
    //
    while (deposit < max) {
        years++
        deposit *= 1.071
    }

    return years
}