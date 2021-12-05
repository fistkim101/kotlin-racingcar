package step2

/**
 *
 * @author Leo
 */
class OperationConstant {
    companion object {

        val PLUS = "+"
        val MINUS = "-"
        val MULTIPLE = "*"
        val DIVIDE = "/"
        val SYMBOLS = listOf(PLUS, MINUS, MULTIPLE, DIVIDE)
        val SPACE = " "
        val EMPTY = ""
    }
}

enum class Operation(val symbol: String, val calculation: (Long, Long) -> Long) {

    PLUS(OperationConstant.PLUS, { num1: Long, num2: Long -> num1 + num2 }),
    MINUS(OperationConstant.MINUS, { num1: Long, num2: Long -> num1 - num2 }),
    MULTIPLE(OperationConstant.MULTIPLE, { num1: Long, num2: Long -> num1 * num2 }),
    DIVIDE(OperationConstant.DIVIDE, { num1: Long, num2: Long -> num1 / num2 });

    companion object {
        fun findCalculation(symbol: String?): Operation {
            require(symbol != null && symbol != OperationConstant.SPACE && symbol != OperationConstant.EMPTY) {
                "null, 빈 문자열, 공백은 허용되지 않습니다."
            }

            require(values().map { it.symbol }.contains(symbol)) {
                "사칙연산 기호가 아닙니다."
            }

            return values().first() { it.symbol == symbol }
        }
    }
}
