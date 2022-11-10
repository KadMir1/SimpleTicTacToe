fun main() {
    // write your code here
    val numOfCompanies = readln().toInt()
    val allCompaniesAnnualIncomes = MutableList(numOfCompanies) { readln().toInt() }
    val allCompaniesTaxPercentages = MutableList(numOfCompanies) { readln().toInt() }
    var highestTaxPaid = Int.MIN_VALUE
    var highestTaxPaidId = 0

    for (companyId in allCompaniesAnnualIncomes.indices) {
        val currentCompanyTaxed = allCompaniesAnnualIncomes[companyId] * allCompaniesTaxPercentages[companyId]
        if (currentCompanyTaxed > highestTaxPaid) {
            highestTaxPaid = currentCompanyTaxed
            highestTaxPaidId = companyId + 1
        }
    }

    println(highestTaxPaidId)
}