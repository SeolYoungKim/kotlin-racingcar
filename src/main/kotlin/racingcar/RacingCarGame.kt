package racingcar

import kotlin.random.Random

object RacingCarGame {
    private const val CAR_COUNT_QUESTION = "자동차 대수는 몇 대인가요?"
    private const val MOVE_ATTEMPT_COUNT_QUESTION = "시도할 횟수는 몇 회인가요?"
    private const val RESULT_MESSAGE = "실행 결과"

    private const val RANDOM_UPPER_BOUND = 10

    fun start() {
        val carCount = readCarCount()
        val cars = CarFactory.create(carCount)

        val moveAttemptCount = readMoveAttemptCount()

        MessagePrinter.print(RESULT_MESSAGE)

        val results = mutableListOf<String>()
        for (i in 1..moveAttemptCount) {
            cars.forEach { car ->
                val randomNumber = Random.nextInt(RANDOM_UPPER_BOUND)
                car.moveOrStay(randomNumber)
            }
            val result = ResultGenerator.generate(cars)
            results.add(result)
        }

        MessagePrinter.print(results)
    }

    private fun readCarCount(): Int {
        MessagePrinter.print(CAR_COUNT_QUESTION)
        return NumberReader.read()
    }

    private fun readMoveAttemptCount(): Int {
        MessagePrinter.print(MOVE_ATTEMPT_COUNT_QUESTION)
        val moveAttemptCount = NumberReader.read()
        return moveAttemptCount
    }
}