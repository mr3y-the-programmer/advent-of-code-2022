fun main() {
    fun part1(input: List<String>): Int {
        return firstDistinctCharsWindow(input, 4)
    }

    fun part2(input: List<String>): Int {
        return firstDistinctCharsWindow(input, 14)
    }

    check(part1(readInput("Day06_sample")) == 10)
    println(part1(readInput("Day06_input")))

    check(part2(readInput("Day06_sample")) == 29)
    println(part2(readInput("Day06_input")))
}

private fun firstDistinctCharsWindow(input: List<String>, windowSize: Int): Int {
    val dataStream = input.joinToString(separator = "")
    dataStream.windowed(windowSize).forEach { candidate ->
        if (candidate.toSet().size == windowSize) {
            return@firstDistinctCharsWindow dataStream.indexOf(candidate) + candidate.length
        }
    }
    return -1
}
