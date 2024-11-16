package calculator

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

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
}