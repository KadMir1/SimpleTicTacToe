package tictactoe

import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    var cells = "_________"
    var player = "X"

    printBoard(cells)

    do {
        cells = getUserMove(cells, player)
        player = fightPlayer(player)
        printBoard(cells)

        val finished = checkState(cells)
    } while (!finished)
}

fun printBoard(cells: String)  {
    println("---------")
    println("| ${cells[0]} ${cells[1]} ${cells[2]} |")
    println("| ${cells[3]} ${cells[4]} ${cells[5]} |")
    println("| ${cells[6]} ${cells[7]} ${cells[8]} |")
    println("---------")
}

fun getRow(cells: String, row: Int): String {
    return "${cells[row * 3]}${cells[row * 3 + 1]}${cells[row * 3 + 2]}"
}

fun getColumn(cells: String, col: Int): String {
    return "${cells[col]}${cells[col + 3]}${cells[col + 6]}"
}

fun checkRows(cells: String): String? {
    for (row in 0..2) {
        if (getRow(cells, row) == "XXX") {
            for (otherRow in 0..2) {
                if (row != otherRow) {
                    if (getRow(cells, otherRow) == "OOO") {
                        return "Impossible"
                    }
                }
            }
            return "X wins"
        } else if (getRow(cells, row) == "OOO") {
            for (otherRow in 0..2) {
                if (row != otherRow) {
                    if (getRow(cells, otherRow) == "XXX") {
                        return "Impossible"
                    }
                }
            }
            return "O wins"
        }
    }
    return null
}

fun checkColumns(cells: String): String? {
    for (col in 0..2) {
        if(getColumn(cells, col) == "XXX") {
            for (otherCol in 0..2) {
                if (col != otherCol) {
                    if (getColumn(cells, otherCol) == "OOO") {
                        return "Impossible"
                    }
                }
            }
            return "X wins"
        } else if (getColumn(cells, col) == "OOO") {
            for (otherCol in 0..2) {
                if (col != otherCol) {
                    if(getColumn(cells, otherCol) == "XXX") {
                        return "Impossible"
                    }
                }
            }
            return "O wins"
        }
    }
    return null
}

fun checkDiagonals(cells: String): String? {
    if (cells[0] != '_' && cells[0] == cells[4] && cells[4] == cells[8]) {
        return "${cells[0]} wins"
    }
    if (cells[2] != '_' && cells[2] == cells[4] && cells[4] == cells[6]) {
        return "${cells[2]} wins"
    }
    return null
}

fun checkState(cells: String): Boolean {
    val countX = cells.filter { it == 'X' }.length
    val countO = cells.filter { it == 'O' }.length
    if (kotlin.math.abs(countO - countX) > 1) {
        println("Impossible")
        return true
    }

    val rowResult = checkRows(cells)
    if (rowResult != null) {
        println(rowResult)
        return true
    }

    val colResult = checkColumns(cells)
    if (colResult != null) {
        println(colResult)
        return true
    }

    val diagResult = checkDiagonals(cells)
    if (diagResult != null) {
        println(diagResult)
        return true
    }

   return if (cells.contains("_")) {
        println("Game not finished")
        false
    } else {
        println("Draw")
        true
    }
}

fun getUserMove(cells: String, player: String): String {
    while (true) {
        println("Enter the coordinates:")


        val input = readLine()!!.trim().split(" ")
        if (input.size != 2) {
            println("You should enter numbers!")
            continue
        }
        try {
            val row = Integer.parseInt(input[0])
            val col = Integer.parseInt(input[1])

            if(row in 1..3 && col in 1..3) {
                val index = 3 * (row - 1) + (col - 1)
                val cell = cells[index]
                if (cell == '_') {
                    return cells.replaceRange(index..index, player)
                } else if (cell in "XO") {
                    println("This cell is occupied! Choose another one!")
                }
            } else {
                println("Coordinates should be from 1 to 3!")
            }
        } catch (ex: NumberFormatException) {
            println("You should enter numbers!")
        }
    }
}

fun fightPlayer(player: String): String {
    return when (player) {
        "X" -> "O"
        "O" -> "X"
        else -> throw Exception("Error game!!!")
    }
}



























