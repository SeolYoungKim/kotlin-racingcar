package racingcar.domain

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class ResultGeneratorTest {
    @Test
    fun `자동차 목록을 받아 각 자동차의 position 에 따라 결과 문자열을 생성한다`() {
        val cars =
            listOf(
                Car(position = 1, name = "김씨"),
                Car(position = 2, name = "박씨"),
                Car(position = 3, name = "이씨"),
            )

        val result = ResultGenerator.generate(cars)

        assertThat(result).isEqualTo(
            """
            김씨 : -
            박씨 : --
            이씨 : ---
            
            """.trimIndent(),
        )
    }
}
