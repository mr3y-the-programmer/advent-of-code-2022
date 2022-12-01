fun main() {
    fun part1(input: List<String>): Int? {
        return input
            .split { line -> line.isBlank() }
            .maxOfOrNull { elfCalories -> elfCalories.sumOf { it.toInt() } }
    }

    fun part2(input: List<String>): Int {
        return input
            .split { line -> line.isBlank() }
            .map { elfCalories -> elfCalories.sumOf { it.toInt() } }
            .sortedDescending()
            .take(3)
            .sum()
    }

    println(part1(readInput("Day01_input")))
    println(part2(readInput("Day01_input")))
}

private fun List<String>.split(predicate: (String) -> Boolean): List<List<String>> {
    val transformed = mutableListOf<List<String>>()
    var temp = mutableListOf<String>()
    forEach {
        if (!predicate(it)) {
            temp.add(it)
        } else {
            transformed.add(temp)
            temp = mutableListOf()
        }
    }
    return transformed
}
