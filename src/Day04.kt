@Suppress("USELESS_CAST")
fun main() {
    fun part1(input: List<String>): Int {
        return input.sumOf { pair ->
            val (firstRange, secondRange) = pair.toIntRanges()
            if (firstRange containsAll secondRange || secondRange containsAll firstRange)
                1
            else
                0
            as Int
        }
    }
    fun part2(input: List<String>): Int {
        return input.sumOf { pair ->
            val (firstRange, secondRange) = pair.toIntRanges()
            if (firstRange containsAll secondRange || secondRange containsAll firstRange || firstRange overlapsWith secondRange)
                1
            else
                0
            as Int
        }
    }

    check(part1(readInput("Day04_sample")) == 2)
    println(part1(readInput("Day04_input")))

    check(part2(readInput("Day04_sample")) == 4)
    println(part2(readInput("Day04_input")))
}

fun String.toIntRanges(): List<IntRange> {
    return split(',')
        .map { range ->
            val start = range.takeWhile { it != '-' }
            IntRange(start = start.toInt(), endInclusive = range.drop(start.length + 1).toInt())
        }
}

infix fun IntRange.containsAll(other: IntRange) = this.first <= other.first && this.last >= other.last

infix fun IntRange.overlapsWith(other: IntRange) = this.last >= other.first && other.last >= this.first
