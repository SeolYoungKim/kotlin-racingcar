package racingcar

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun `입력값 만큼 자동차를 이동시킨다`() {
        val car = Car()

        car.move(10)

        assertThat(car.position).isEqualTo(10)
    }
}