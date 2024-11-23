package racingcar.domain

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll

class RaceWinnerDecider {
    fun decide(cars: List<Car>): List<Car> {
        TODO("Not yet implemented")
    }
}

class RaceWinnerDeciderTest {
    @Test
    fun `자동차 목록에서 가장 많이 이동한 자동차를 우승자로 선출한다 (같은 점수일 경우 여러개를 선출한다)`() {
        val winner1 = Car(name = "김씨", position = 10)
        val winner2 = Car(name = "이씨", position = 10)
        val looser = Car(name = "외톨이", position = 1)
        val cars = listOf(winner1, winner2, looser,)

        val raceWinnerDecider = RaceWinnerDecider()

        val winners = raceWinnerDecider.decide(cars)

        assertAll(
            { assertThat(winners).hasSize(2) },
            { assertThat(winners).containsExactly(winner1, winner2) },
        )
    }
}