package racingcar

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class ResultGeneratorTest {
    @Test
    fun `자동차 목록을 받아 각 자동차의 position 에 따라 결과 문자열을 생성한다`() {
        val cars = listOf(
            Car(1),
            Car(2),
            Car(3),
        )

        val result = ResultGenerator.generate(cars)

        assertThat(result).isEqualTo("""
            -
            --
            ---
            
        """.trimIndent())
    }
}