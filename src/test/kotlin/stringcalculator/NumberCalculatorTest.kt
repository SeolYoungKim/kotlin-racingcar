package stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class NumberCalculatorTest {
    @Test
    fun `덧셈을 수행한다`() {
        val numberCalculator = NumberCalculator()

        val result = numberCalculator.sum(1, 2)

        assertThat(result).isEqualTo(3)
    }

    @Test
    fun `뺄셈을 수행한다`() {
        val numberCalculator = NumberCalculator()

        val result = numberCalculator.subtract(1, 2)

        assertThat(result).isEqualTo(-1)
    }

    @Test
    fun `곱셈을 수행한다`() {
        val numberCalculator = NumberCalculator()

        val result = numberCalculator.multiply(1, 2)

        assertThat(result).isEqualTo(2)
    }

    @Test
    fun `나눗셈을 수행한다`() {
        val numberCalculator = NumberCalculator()

        val result = numberCalculator.divide(2, 2)

        assertThat(result).isEqualTo(1)
    }

    @ParameterizedTest
    @CsvSource(
        "2, PLUS, 2, 4",
        "2, MINUS, 2, 0",
        "2, MULTIPLY, 2, 4",
        "2, DIVIDE, 2, 1",
    )
    fun `입력된 연산자에 해당하는 연산을 수행한다`(leftNumber: Int, operator: Operator, rightNumber: Int, expected: Int) {
        val numberCalculator = NumberCalculator()

        val actual = numberCalculator.calculate(leftNumber, operator, rightNumber)

        assertThat(actual).isEqualTo(expected)
    }
}