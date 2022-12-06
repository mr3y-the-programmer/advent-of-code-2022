fun main() {
    fun part1(input: List<String>): List<String> {
//        val (cratesStacks, rearrangementProcedure) =
//            .joinToString(separator = "\n")


        return input.takeWhile { it != "\n\n" }
    }

//    check(part1(readInput("Day02_sample")) == 15)
    println(part1(readInput("Day05_sample")))/*.split("\n\n")*/

//    check(part2(readInput("Day02_sample")) == 12)
//    println(part2(readInput("Day02_input")))
}

class CargoCrane private constructor() {

    /*companion object {
        fun parse(cranesInput: String): CargoCrane {
            val columns = cranesInput.lineSequence().first().length - 1
            for (i in 0..columns step 4) {
                for (j in 0..cranesInput.lineSequence())
            }
            return CargoCrane()
        }
    }*/
}

