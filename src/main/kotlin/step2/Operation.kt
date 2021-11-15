package step2

/**
 *
 * @author Leo
 */
enum class Operation(val symbol: String, val calculation: (Long, Long) -> Long) {

    PLUS("+", { num1: Long, num2: Long -> num1 + num2 }),
    MINUS("-", { num1: Long, num2: Long -> num1 - num2 }),
    MULTIPLE("*", { num1: Long, num2: Long -> num1 * num2 }),
    DIVIDE("/", { num1: Long, num2: Long -> num1 / num2 });

    companion object {

        val PLUS = "+"
        val MINUS = "-"
        val MULTIPLE = "*"
        val DIVIDE = "/"
        val CALCULATIONS = listOf(PLUS, MINUS, MULTIPLE, DIVIDE)
        val SPACE = " "
        val EMPTY = ""

        fun findCalculation(symbol: String?): Operation {
            require(symbol != null && symbol != SPACE && symbol != EMPTY) {
                throw IllegalArgumentException("null, 빈 문자열, 공백은 허용되지 않습니다.")
            }

            require(values().map { it.symbol }.contains(symbol)) {
                throw IllegalArgumentException("사칙연산 기호가 아닙니다.")
            }

            return values().first() { it.symbol == symbol }
        }
    }
}
