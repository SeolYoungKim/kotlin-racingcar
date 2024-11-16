package calculator

import java.util.regex.Pattern

class StringCalculator {
    private val pattern: Pattern = Pattern.compile("^\\s*\\d+(\\s*[-+*/]\\s*\\d+)*\\s*\$")

    fun calculate(input: String?) {
        validate(input)
    }

    private fun validate(input: String?) {
        if (input.isNullOrBlank()) {
            throw IllegalArgumentException("입력값이 null이나 공백일 수 없습니다.")
        }

        if (pattern.matcher(input).matches().not()) {
            throw IllegalArgumentException(
                """
                    입력 형태 또는 사용된 연산자가 잘못되었습니다.
                    - 현재 입력 : $input
                    - 사용 가능한 연산자 : +, -, *, /
                    - 입력 예: 2 + 3 * 4 / 2
                """.trimIndent()
            )
        }
    }

}