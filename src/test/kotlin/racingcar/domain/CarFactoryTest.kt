package racingcar.domain

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class CarFactoryTest {
    @Test
    fun `입력된 개수만큼 자동차를 만든다`() {
        val cars = CarFactory.create(10)

        assertThat(cars).hasSize(10)
    }
}
