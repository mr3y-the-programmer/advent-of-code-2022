fun main() {
    fun part1(input: List<String>): Int {
        return input.sumOf { rucksack ->
            rucksack
                .chunked(rucksack.length / 2)
                .let { it[0].intersect(it[1]) }
                .calculatePriority()
        }
    }

    fun part2(input: List<String>): Int {
        return input.chunked(3) { groupOfThree ->
            groupOfThree
                .let { it[0].intersect(it[1], it[2]) }
                .calculatePriority()
        }.sum()
    }

    check(part1(readInput("Day03_sample")) == 157)
    println(part1(readInput("Day03_input")))

    check(part2(readInput("Day03_sample")) == 70)
    println(part2(readInput("Day03_input")))
}

private fun String.intersect(vararg others: String): Char {
    var chain = toSet()
    others.forEach {
        chain = chain.intersect(it.toSet())
    }
    return chain.single()
}

private fun Char.calculatePriority(): Int {
    return when {
        isLowerCase() -> { this - 'a' + 1 }
        isUpperCase() -> { this - 'A' + 27 }
        else -> -1
    }
}
