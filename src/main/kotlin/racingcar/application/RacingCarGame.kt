package racingcar.application

import racingcar.domain.Car
import racingcar.domain.CarFactory
import racingcar.domain.RaceWinnerDecider
import kotlin.random.Random

class RacingCarGame(
    private val messagePrinter: MessagePrinter,
    private val stringsReader: StringsReader,
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
        return stringsReader.read()
    }

    private fun readMoveAttemptCount(): Int {
        messagePrinter.printMoveAttemptCountQuestion()
        val moveAttemptCount = numberReader.read()
        return moveAttemptCount
    }

    private fun runRace(
        moveAttemptCount: Int,
        cars: List<Car>,
    ) {
        messagePrinter.printResultMessage()

        val results =
            (1..moveAttemptCount).map {
                cars.forEach { car ->
                    car.moveOrStay(Random.nextInt(RANDOM_UPPER_BOUND))
                }
                messagePrinter.printRaceResultMessage(cars)
            }
    }

    private fun decideWinners(cars: List<Car>) {
        val winners = RaceWinnerDecider.decide(cars)
        messagePrinter.printWinners(winners)
    }

    companion object {
        private const val RANDOM_UPPER_BOUND = 10
    }
}
