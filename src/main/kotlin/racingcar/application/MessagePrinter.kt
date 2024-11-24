package racingcar.application

import racingcar.domain.Car

interface MessagePrinter {
    fun printCarCountQuestion()

    fun printMoveAttemptCountQuestion()

    fun printResultMessage()

    fun printRaceResultMessage(cars: List<Car>)

    fun printWinners(winners: List<Car>)
}
