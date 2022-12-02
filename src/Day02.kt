@Suppress("USELESS_CAST")
fun main() {
    fun part1(input: List<String>): Int {
        return input.sumOf { round ->
            val (opponentChoice, yourChoice) = round.split(" ").let { it[0] to it[1] }
            when (yourChoice) {
                "X" -> { // Rock
                    when (opponentChoice) {
                        "A" -> {
                            4
                        }
                        "B" -> {
                            1
                        }
                        "C" -> {
                            7
                        }
                        else -> throw IllegalArgumentException()
                    }
                }
                "Y" -> { // Paper
                    when (opponentChoice) {
                        "A" -> {
                            8
                        }
                        "B" -> {
                            5
                        }
                        "C" -> {
                            2
                        }
                        else -> throw IllegalArgumentException()
                    }
                }
                "Z" -> { // Scissors
                    when (opponentChoice) {
                        "A" -> {
                            3
                        }
                        "B" -> {
                            9
                        }
                        "C" -> {
                            6
                        }
                        else -> throw IllegalArgumentException()
                    }
                }
                else -> throw IllegalArgumentException()
            } as Int
        }
    }

    fun part2(input: List<String>): Int {
        return input.sumOf { round ->
            val (opponentChoice, yourChoice) = round.split(" ").let { it[0] to it[1] }
            when (yourChoice) {
                "X" -> { // lose
                    when (opponentChoice) {
                        "A" -> { // Rock
                            3
                        }
                        "B" -> { // Paper
                            1
                        }
                        "C" -> { // Scissors
                            2
                        }
                        else -> throw IllegalArgumentException()
                    }
                }
                "Y" -> { // Draw
                    when (opponentChoice) {
                        "A" -> {
                            4
                        }
                        "B" -> {
                            5
                        }
                        "C" -> {
                            6
                        }
                        else -> throw IllegalArgumentException()
                    }
                }
                "Z" -> { // Win
                    when (opponentChoice) {
                        "A" -> {
                            8
                        }
                        "B" -> {
                            9
                        }
                        "C" -> {
                            7
                        }
                        else -> throw IllegalArgumentException()
                    }
                }
                else -> throw IllegalArgumentException()
            } as Int
        }
    }

    check(part1(readInput("Day02_sample")) == 15)
    println(part1(readInput("Day02_input")))

    check(part2(readInput("Day02_sample")) == 12)
    println(part2(readInput("Day02_input")))
}