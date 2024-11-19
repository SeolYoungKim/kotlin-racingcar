package stringcalculator

class NumberCalculator {
    fun sum(
        left: Int,
        right: Int,
    ): Int = left + right

    fun subtract(
        left: Int,
        right: Int,
    ): Int = left - right

    fun multiply(
        left: Int,
        right: Int,
    ): Int = left * right

    fun divide(
        left: Int,
        right: Int,
    ): Int = left / right

    fun calculate(
        leftNumber: Int,
        operator: Operator,
        rightNumber: Int,
    ): Int {
        return when (operator) {
            Operator.PLUS -> sum(leftNumber, rightNumber)
            Operator.MINUS -> subtract(leftNumber, rightNumber)
            Operator.MULTIPLY -> multiply(leftNumber, rightNumber)
            Operator.DIVIDE -> divide(leftNumber, rightNumber)
        }
    }
}
