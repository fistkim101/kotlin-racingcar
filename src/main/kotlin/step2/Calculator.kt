package step2

import step2.Operation.Companion.CALCULATIONS
import step2.Operation.Companion.SPACE

/**
 *
 * @author Leo
 */
class Calculator {

    fun calculate(expression: String): Long {
        val classifiedParams = classifyParams(expression = expression)
        val numbers = classifiedParams.first
        val operations = classifiedParams.second
        var result = 0L

        numbers
            .withIndex()
            .forEach { (index, number) ->
                if (index == 0) {
                    result = numbers[0]
                    return@forEach
                }

                result = operations[index - 1].calculation(result, number)
            }

        return result
    }

    fun classifyParams(expression: String): Pair<MutableList<Long>, MutableList<Operation>> {
        val numbers = mutableListOf<Long>()
        val operations = mutableListOf<Operation>()

        expression.split(SPACE)
            .forEach { param ->
                if (!CALCULATIONS.contains(param)) {
                    numbers.add(param.toLong())
                    return@forEach
                }

                operations.add(Operation.findCalculation(param))
            }

        return Pair(numbers, operations)
    }
}
