package stringcalculator

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.NullAndEmptySource
import org.junit.jupiter.params.provider.ValueSource

class StringCalculatorTest {
    @ParameterizedTest
    @ValueSource(
        strings = [
            "a + b", "1 + !", "딱 + 9",
            "1 ++ 1", "1 -+ 1", "1 | 1", "1 % 1", "1 ! 1", "1 -- 1", "1 *+ 1", "1 + 1 +"
        ]
    )
    @NullAndEmptySource
    fun `{숫자 연산자 숫자} 형태의 입력이 아닐 경우 예외를 발생시킨다`(input: String?) {
        val stringCalculator = StringCalculator()

        assertThatThrownBy { stringCalculator.calculate(input) }
            .isInstanceOf(IllegalArgumentException::class.java)
    }
}