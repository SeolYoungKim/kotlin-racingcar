package racingcar.ui

import racingcar.domain.Car

object WinnerMessageGenerator {
    private const val POSTFIX = "가 최종 우승했습니다."

    fun generate(winners: List<Car>): String {
        return winners.joinToString { car -> car.name } + POSTFIX
    }
}
