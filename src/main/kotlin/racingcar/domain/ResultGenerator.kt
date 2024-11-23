package racingcar.domain

object ResultGenerator {
    private const val RESULT_STRING = "-"

    fun generate(cars: List<Car>): String {
        val lineSeparator = System.lineSeparator()
        return cars.joinToString(separator = lineSeparator, postfix = lineSeparator) { car ->
            convertToResultFormat(car)
        }
    }

    private fun convertToResultFormat(car: Car): String {
        return RESULT_STRING.repeat(car.position)
    }
}