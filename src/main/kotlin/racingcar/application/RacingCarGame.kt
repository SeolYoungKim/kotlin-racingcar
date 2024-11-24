package racingcar.application

import racingcar.domain.Car
import racingcar.domain.CarFactory
import racingcar.domain.CarMovementRule
import racingcar.domain.RaceWinnerDecider

class RacingCarGame(
    private val messagePrinter: MessagePrinter,
    private val carNameReader: CarNameReader,
    private val numberReader: NumberReader,
) {
    fun start() {
        val carNames = readCarNames()
        val cars = CarFactory.create(carNames)

        val moveAttemptCount = readMoveAttemptCount()

        runRace(moveAttemptCount, cars)
        decideWinners(cars)
    }

    private fun readCarNames(): List<String> {
        messagePrinter.printCarCountQuestion()
        return carNameReader.read()
    }

    private fun readMoveAttemptCount(): Int {
        messagePrinter.printMoveAttemptCountQuestion()
        return numberReader.read()
    }

    private fun runRace(
        moveAttemptCount: Int,
        cars: List<Car>,
    ) {
        messagePrinter.printResultMessage()

        repeat(moveAttemptCount) {
            CarMovementRule.apply(cars)
            messagePrinter.printRaceResultMessage(cars)
        }
    }

    private fun decideWinners(cars: List<Car>) {
        val winners = RaceWinnerDecider.decide(cars)
        messagePrinter.printWinners(winners)
    }
}
