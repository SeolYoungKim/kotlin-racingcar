package racingcar.application

import racingcar.domain.Car
import racingcar.domain.CarFactory
import racingcar.domain.RaceWinnerDecider
import racingcar.domain.RaceResultGenerator
import kotlin.random.Random

class RacingCarGame(
    private val messagePrinter: MessagePrinter,
    private val stringsReader: StringsReader,
    private val numberReader: NumberReader,
) {
    companion object {
        private const val CAR_COUNT_QUESTION = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."
        private const val MOVE_ATTEMPT_COUNT_QUESTION = "시도할 횟수는 몇 회인가요?"
        private const val RESULT_MESSAGE = "실행 결과"

        private const val RANDOM_UPPER_BOUND = 10
    }

    fun start() {
        val carNames = readCarNames()
        val cars = CarFactory.create(carNames)

        val moveAttemptCount = readMoveAttemptCount()

        runRace(moveAttemptCount, cars)
        decideWinners(cars)
    }

    private fun readCarNames(): List<String> {
        messagePrinter.print(CAR_COUNT_QUESTION)
        return stringsReader.read()
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
                RaceResultGenerator.generate(cars)
            }

        messagePrinter.print(results)
    }

    private fun decideWinners(cars: List<Car>) {
        val winners = RaceWinnerDecider.decide(cars)
        val message = WinnerMessageGenerator.generate(winners)
        messagePrinter.print(message)
    }
}
