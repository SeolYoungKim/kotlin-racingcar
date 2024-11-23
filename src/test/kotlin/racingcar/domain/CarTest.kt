package racingcar.domain

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class CarTest {
    @ParameterizedTest
    @ValueSource(ints = [4, 5])
    fun `값이 4 이상일 경우 position을 1 증가시킨다`(condition: Int) {
        val car = Car()

        car.moveOrStay(condition)

        assertThat(car.position).isEqualTo(1)
    }

    @ParameterizedTest
    @ValueSource(ints = [2, 3])
    fun `값이 4 미만일 경우 position은 그대로 유지된다`(condition: Int) {
        val car = Car()

        car.moveOrStay(condition)

        assertThat(car.position).isEqualTo(0)
    }
}
