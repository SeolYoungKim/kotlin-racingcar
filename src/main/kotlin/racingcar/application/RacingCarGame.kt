package racingcar.application

import racingcar.domain.Car
import racingcar.domain.CarFactory
import racingcar.domain.ResultGenerator
import kotlin.random.Random

class RacingCarGame(
    private val messagePrinter: MessagePrinter,
    private val numberReader: NumberReader,
) {
    companion object {
        private const val CAR_COUNT_QUESTION = "자동차 대수는 몇 대인가요?"
        private const val MOVE_ATTEMPT_COUNT_QUESTION = "시도할 횟수는 몇 회인가요?"
        private const val RESULT_MESSAGE = "실행 결과"

        private const val RANDOM_UPPER_BOUND = 10
    }

    fun start() {
        val carCount = readCarCount()
        val cars = CarFactory.create(carCount)

        val moveAttemptCount = readMoveAttemptCount()

        runRace(moveAttemptCount, cars)
    }

    private fun readCarCount(): Int {
        messagePrinter.print(CAR_COUNT_QUESTION)
        return numberReader.read()
    }

    private fun readMoveAttemptCount(): Int {
        messagePrinter.print(MOVE_ATTEMPT_COUNT_QUESTION)
        val moveAttemptCount = numberReader.read()
        return moveAttemptCount
    }

    private fun runRace(
        moveAttemptCount: Int,
        cars: List<Car>,
    ) {
        messagePrinter.print(RESULT_MESSAGE)

        val results =
            (1..moveAttemptCount).map {
                cars.forEach { car ->
                    car.moveOrStay(Random.nextInt(RANDOM_UPPER_BOUND))
                }
                ResultGenerator.generate(cars)
            }

        messagePrinter.print(results)
    }
}
